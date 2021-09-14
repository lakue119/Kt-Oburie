package com.lakue.oburie.ui.splash

import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.pref.PrefManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SplashViewModel @Inject constructor(
    val prefManager: PrefManager
): BaseViewModel() {

    fun isLogin(): Boolean{
        return prefManager.isLogin
    }

}