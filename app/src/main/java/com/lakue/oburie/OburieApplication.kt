package com.lakue.oburie

import android.app.Activity
import android.app.Application
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatDialog
import com.kakao.sdk.common.KakaoSdk
import com.lakue.oburie.utils.BaseUtils.init
import dagger.hilt.android.HiltAndroidApp
import javax.net.ssl.SSLContext

@HiltAndroidApp
class OburieApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        init(this)
        KakaoSdk.init(this, getString(R.string.kakao_app_key))
//        val ssl = SSLConnect()
//        ssl.postHttps("http://192.168.0.3:8080/",1000,1000)
    }
}