package com.lakue.oburie.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.facebook.stetho.common.LogUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityMainBinding
import com.lakue.oburie.databinding.ActivitySplashBinding
import com.lakue.oburie.ui.login.LoginActivity.Companion.startLoginActivity
import com.lakue.oburie.ui.main.MainActivity.Companion.startMainActivity
import com.lakue.oburie.ui.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(R.layout.activity_splash) {

    override fun init() {
        LogUtil.i("LoginData","${viewModel.getLoginData().toString()}")
        Handler().postDelayed({
            if(viewModel.isLogin()){
                startMainActivity(this@SplashActivity)
            } else {
                startLoginActivity(this@SplashActivity)
            }
            finish()
        },1000)

    }

}