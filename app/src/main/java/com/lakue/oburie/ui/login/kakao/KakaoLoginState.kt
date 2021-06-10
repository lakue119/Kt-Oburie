package com.lakue.oburie.ui.login.kakao

import com.kakao.sdk.user.model.User

interface KakaoLoginState {
    fun onSuccess(user: User)
    fun onError(error: Throwable)
}