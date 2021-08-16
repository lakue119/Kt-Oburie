package com.lakue.oburie.model.retrofit.login

import com.lakue.oburie.model.retrofit.ResponseResultFail

data class ResponseJoin(
    val result: Boolean,
    val data: ResponseJoinData,
    val fail: ResponseResultFail
)
