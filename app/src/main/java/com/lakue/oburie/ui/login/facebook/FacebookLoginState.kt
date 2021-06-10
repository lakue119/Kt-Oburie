package com.lakue.oburie.ui.login.facebook

import com.facebook.FacebookException
import com.facebook.login.LoginResult

interface FacebookLoginState {
    fun onSuccess(result: LoginResult)
    fun onError(error: FacebookException)
    fun onCancel()
}