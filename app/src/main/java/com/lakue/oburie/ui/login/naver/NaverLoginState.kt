package com.lakue.oburie.ui.login.naver

import com.nhn.android.naverlogin.OAuthLogin

interface NaverLoginState {
    fun onSuccess(result: OAuthLogin)
    fun onError(error: OAuthLogin)
}