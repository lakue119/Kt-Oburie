package com.lakue.oburie.ui.main

import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Base64
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.bumptech.glide.Glide
import com.kakao.sdk.common.util.Utility
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityMainBinding
import com.lakue.oburie.databinding.DialogReviewBinding
import com.lakue.oburie.fcm.FcmManager
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.login.LoginActivity.Companion.startLoginActivity
import com.lakue.oburie.utils.LogUtil
import com.lakue.oburie.utils.LoginData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override fun init() {
        NavigationUI.setupWithNavController(
            bottomNavigationView,
            findNavController(R.id.nav_host_fragment)
        )
        bottomNavigationView.itemIconTintList = null

        getHashKey()
        getFcmToken()
    }

    override fun setUI() {

        if(LoginData.userId == null){
            startLoginActivity(this@MainActivity)
        }

//        showSuccessDialog(Profile(
//                "PLATINUM",
//                "가야금",
//                "대전,서울,천안",
//                4.0f, 4.0f, 4.0f, 4.0f, 38,
//                arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
//                UserInfo("최명락", "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfNTEg/MDAxNTgxMDg1ODYyMjc5.nbkCfRoTfo15xgsGlv82ZmN0wBiTGhdJCxIqC5bOCpog.3hhxLTquJPHdN_Qc5PFyFyiqpLfsNORaKAuIB2rfDfgg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7131.jpg?type=w800","","","","","",""), 100, "안녕하세용~~", "경력", "수상내역",
//            arrayListOf(
//                Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")
//            ),
//                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
//                        "잘생김에 보컬까지~"))
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    var progressDialog: AppCompatDialog? = null

    fun showSuccessDialog(profile: Profile){
        if (progressDialog != null && progressDialog!!.isShowing) {
            return
        } else {
            progressDialog = AppCompatDialog(this@MainActivity)
            progressDialog!!.setCancelable(false)
            progressDialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            progressDialog!!.setContentView(R.layout.dialog_review)
            val reviewBinding: DialogReviewBinding = DataBindingUtil.inflate(
                LayoutInflater.from(progressDialog!!.context),
                R.layout.dialog_review,
                progressDialog!!.findViewById<RelativeLayout>(R.id.dialog_rl_review) as ViewGroup,
                false
            )
            reviewBinding.profile = profile
            reviewBinding.activity = this@MainActivity
            progressDialog!!.show()
        }

        val tvClose = progressDialog!!.findViewById<TextView>(R.id.tv_close)
        val tvShow = progressDialog!!.findViewById<TextView>(R.id.tv_show)
        val tvName = progressDialog!!.findViewById<TextView>(R.id.tv_name)
        val rivProfile = progressDialog!!.findViewById<ImageView>(R.id.riv_profile)

        tvName?.text = "'${profile.userInfo.nickName}'${getString(R.string.how_together_review)}"
        rivProfile?.let { Glide.with(this@MainActivity).load(profile.userInfo.userProfileImg).into(
            it
        ) }


        tvClose?.onThrottleClick {
            if (progressDialog != null) {
                progressDialog!!.dismiss()
            }
        }
        tvShow?.onThrottleClick {
            if (progressDialog != null) {
                progressDialog!!.dismiss()
            }
        }
    }

    fun onDialogFinish(){
        if (progressDialog != null) {
            progressDialog!!.dismiss()
        }
    }

    private fun getHashKey() {
        var packageInfo: PackageInfo? = null
        try {
            packageInfo = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        if (packageInfo == null) LogUtil.e("KeyHash", "KeyHash:null")
        for (signature in packageInfo!!.signatures) {
            try {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                LogUtil.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT))
            } catch (e: NoSuchAlgorithmException) {
                LogUtil.e("KeyHash", "Unable to get MessageDigest. signature=$signature", e)
            }
        }
    }

    private fun getFcmToken(){
        FcmManager.getFcmToken(object :FcmManager.OnEventListener{
            override fun onSuccess(token: String) {
                LogUtil.i("QWLKRJQKWLR0",token)
            }
        })
    }

}