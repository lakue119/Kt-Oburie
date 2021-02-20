package com.lakue.oburie

import android.app.Application
import com.lakue.oburie.utils.BaseUtils.init
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ZApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }
}