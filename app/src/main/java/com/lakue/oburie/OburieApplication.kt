package com.lakue.oburie

import android.app.Application
import com.lakue.oburie.utils.BaseUtils.init
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class OburieApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }
}