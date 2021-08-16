package com.lakue.oburie.model.retrofit.login

import com.lakue.oburie.model.retrofit.ResponseResultData
import com.lakue.oburie.model.retrofit.ResponseResultFail

data class ResponseJoinCheck(
    val result: Boolean,
    val data: Boolean,
    val fail: ResponseResultFail
)
