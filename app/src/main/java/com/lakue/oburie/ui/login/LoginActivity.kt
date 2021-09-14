package com.lakue.oburie.ui.login

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatDialog
import androidx.databinding.DataBindingUtil
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.kakao.sdk.user.model.User
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityLoginBinding
import com.lakue.oburie.databinding.DialogJoinBinding
import com.lakue.oburie.ui.login.facebook.FacebookLogin
import com.lakue.oburie.ui.login.facebook.FacebookLoginState
import com.lakue.oburie.ui.login.kakao.KakaoLogin
import com.lakue.oburie.ui.login.kakao.KakaoLoginState
import com.lakue.oburie.ui.login.naver.NaverLogin
import com.lakue.oburie.ui.login.naver.NaverLoginState
import com.lakue.oburie.ui.login.naver.NaverUserInfo
import com.lakue.oburie.ui.main.MainActivity
import com.lakue.oburie.utils.LogUtil
import com.lakue.oburie.utils.loading.Status
import com.nhn.android.naverlogin.OAuthLogin
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject

@AndroidEntryPoint
class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(R.layout.activity_login) {

    lateinit var callbackManager: CallbackManager

    var joinDialog: AppCompatDialog? = null

    companion object {
        fun startLoginActivity(
            context: Context
        ) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            activity = this@LoginActivity
        }
        callbackManager = CallbackManager.Factory.create()
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
        viewModel.apply{
            loginCheck.observe(this@LoginActivity, {
                when(it.status){
                    Status.ERROR -> {
                        hideLoading()
                        showToast("${it.data.toString()}")
                    }
                    Status.LOADING -> {
                        showToast("${it.data.toString()}")
                    }
                    Status.NETWORK_ERROR -> {
                        hideLoading()
                        showToast("NETWORK_ERROR")
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        if(it.data!!.result){
                                if(it.data!!.data.isJoin){
                                    //기존 회원 로그인 성공 - 메인화면으로 이동
                                    setPref(it.data.data)
                                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                                    startActivity(intent)
                                    finish()
                                } else{
                                    //신규 회원 가입
                                    onShowJoin()
                                }
                        } else {
                            showToast("${it.data.fail.message}")
                        }
//                        showToast("${it.data.toString()}")
                    }
                    Status.TIMEOUT_ERROR -> {
                        hideLoading()
                        showToast("TIMEOUT_ERROR")
                    }
                }
            })

            join.observe(this@LoginActivity, {
                when(it.status){
                    Status.ERROR -> {
                        onJoinClose()
                        hideLoading()
                    }
                    Status.LOADING -> {
                        onJoinClose()
                        hideLoading()
                    }
                    Status.NETWORK_ERROR -> {
                        onJoinClose()
                        hideLoading()
                        showToast("NETWORK_ERROR")
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        if(it.data!!.result){
                            //TODO 기존 회원 로그인 성공 - 메인화면으로 이동
                            onJoinClose()
                            setPref(it.data.data)
                            val intent = Intent(this@LoginActivity, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            //TODO 신규 회원 가입
                            showToast("${it.data.fail.message}")
                        }

                    }
                    Status.TIMEOUT_ERROR -> {
                        onJoinClose()
                        hideLoading()
                        showToast("TIMEOUT_ERROR")
                    }
                }
            })
        }
    }

    fun onFacebookLogin() {
        showLoading()
        FacebookLogin(this, callbackManager, object : FacebookLoginState {
            override fun onSuccess(result: LoginResult) {
                val request: GraphRequest
                request = GraphRequest.newMeRequest(result.accessToken) { user, response ->
                    if (response.error != null) {
                    } else {
                        LogUtil.d("LOGIN","facebook / ${user.toString()}")
                        val id = user.getString("id")
                        viewModel.fetchLoginCheck(id, LoginType.LOGIN_FACEBOOK.type)
//                        viewModel.fetchLoginCheck(user.g)
                    }
                }
                val parameters = Bundle()
                parameters.putString("fields", "id,name,email,gender,birthday")
                request.parameters = parameters
                request.executeAsync()
            }

            override fun onError(error: FacebookException) {
                hideLoading()
                if (error is FacebookAuthorizationException) {
                    showToast("기존 아이디를 로그아웃합니다.")
                    if (AccessToken.getCurrentAccessToken() != null) {
                        LoginManager.getInstance().logOut()
                    }
                }
                showToast("페이스북 로그인 진행중 문제가 발생하였습니다.")
            }

            override fun onCancel() {
                hideLoading()
                showToast("페이스북 로그인을 취소하였습니다.")
            }
        })
    }

    fun onKakaoLogin() {
        showLoading()
        KakaoLogin(this, object : KakaoLoginState {
            override fun onSuccess(user: User) {
//                viewModel.featureKakaoLogin(user)
                LogUtil.d("LOGIN","kakao / ${user.toString()}")
                viewModel.fetchLoginCheck(user.id.toString(), LoginType.LOGIN_KAKAO.type)
            }

            override fun onError(error: Throwable) {
                hideLoading()
                showToast("카카오톡에 로그인 후 사용해주세요.")
                LogUtil.e("KakaoLogin", "사용자 정보 요청 실패", error)
            }

        })
    }

    fun onNaverLogin() {
        showLoading()
        NaverLogin(this, object : NaverLoginState {
            override fun onSuccess(result: OAuthLogin) {
                val accessToken = result.getAccessToken(this@LoginActivity)
                CoroutineScope(Dispatchers.Main).launch {
                    // Show progress from UI thread
                    var user_info: JSONObject
                    var response: JSONObject
                    withContext(CoroutineScope(Dispatchers.Default).coroutineContext) {
                        user_info = NaverUserInfo.getUserInfo(accessToken)

                        response = user_info.getJSONObject("response")
                        LogUtil.d("LOGIN","naver / ${response.toString()}")
//
                        var id = response.getString("id")
                        viewModel.fetchLoginCheck(id, LoginType.LOGIN_NAVER.type)

//
//                        Logger.i("alkwjrklwrl", "id : $id")
//                        Logger.i("alkwjrklwrl", "email : $email")
//                        Logger.i("alkwjrklwrl", "name : $name")
//
//                        startJoinStep1Activity(this@ActivityLoginV2, LoginType.NAVER,
//                                id.toString(),
//                                name.toString().ifNullEmpty(),
//                                email.toString().ifNullEmpty(),
//                                ""
//                        )
                    }
                    // UI data update from UI thread
                    // Hide Progress from UI thread
//                    viewModel.featureNaverLogin(response)

                }
            }

            override fun onError(error: OAuthLogin) {
                val errorCode = error.getLastErrorCode(this@LoginActivity).code
                val errorDesc = error.getLastErrorDesc(this@LoginActivity)
                LogUtil.i("KLQJWRLKQJWRLKJWQR", "errorCode : $errorCode")
                LogUtil.i("KLQJWRLKQJWRLKJWQR", "errorDesc : $errorDesc")
                hideLoading()
            }

        })


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        try {
            callbackManager.onActivityResult(requestCode, resultCode, data)
        } catch (e: NullPointerException) {
            showToast("다시 시도해주세요.")
        }
    }

    @SuppressLint("MissingPermission")
    fun onShowJoin() {

        if (joinDialog == null) {
            joinDialog = AppCompatDialog(this@LoginActivity)
        }

        val binding = DataBindingUtil.inflate<DialogJoinBinding>(LayoutInflater.from(this@LoginActivity), R.layout.dialog_join, null, false)
        joinDialog?.apply {
            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            setCancelable(false)
            setContentView(binding.root)
            show()
        }

        binding.apply {
            activity = this@LoginActivity
            vm = viewModel
        }

    }

    fun onJoinClose(){
        if (joinDialog != null) {
            joinDialog!!.dismiss()
        }
    }

    fun onLogin(){
        viewModel.fetchJoin()
    }
}