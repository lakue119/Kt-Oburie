package com.lakue.oburie.ui.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.kakao.sdk.user.model.User
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityLoginBinding
import com.lakue.oburie.ui.login.facebook.FacebookLogin
import com.lakue.oburie.ui.login.facebook.FacebookLoginState
import com.lakue.oburie.ui.login.kakao.KakaoLogin
import com.lakue.oburie.ui.login.kakao.KakaoLoginState
import com.lakue.oburie.ui.login.naver.NaverLogin
import com.lakue.oburie.ui.login.naver.NaverLoginState
import com.lakue.oburie.ui.login.naver.NaverUserInfo
import com.lakue.oburie.utils.LogUtil
import com.nhn.android.naverlogin.OAuthLogin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(R.layout.activity_login) {

    lateinit var callbackManager: CallbackManager

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
    }

    fun onFacebookLogin() {
        FacebookLogin(this, callbackManager, object : FacebookLoginState {
            override fun onSuccess(result: LoginResult) {
                val request: GraphRequest
                request = GraphRequest.newMeRequest(result.accessToken) { user, response ->
                    if (response.error != null) {
                    } else {
                        LogUtil.d("LOGIN","facebook / ${user.toString()}")
//                        viewModel.featureFacebookLogin(user)
                    }
                }
                val parameters = Bundle()
                parameters.putString("fields", "id,name,email,gender,birthday")
                request.parameters = parameters
                request.executeAsync()
            }

            override fun onError(error: FacebookException) {
                if (error is FacebookAuthorizationException) {
                    showToast("기존 아이디를 로그아웃합니다.")
                    if (AccessToken.getCurrentAccessToken() != null) {
                        LoginManager.getInstance().logOut()
                    }
                }
                showToast("페이스북 로그인 진행중 문제가 발생하였습니다.")
            }

            override fun onCancel() {
                showToast("페이스북 로그인을 취소하였습니다.")
            }
        })
    }

    fun onKakaoLogin() {
        KakaoLogin(this, object : KakaoLoginState {
            override fun onSuccess(user: User) {
//                viewModel.featureKakaoLogin(user)
                LogUtil.d("LOGIN","kakao / ${user.toString()}")
            }

            override fun onError(error: Throwable) {
                showToast("카카오톡에 로그인 후 사용해주세요.")
                LogUtil.e("KakaoLogin", "사용자 정보 요청 실패", error)
            }

        })
    }

    fun onNaverLogin() {
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
//                        var id = response.getString("id")
//                        var email = response.getString("email")
//                        var name = response.getString("name")
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

}