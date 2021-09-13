package com.lakue.oburie.model.retrofit.login

import com.google.gson.annotations.SerializedName
import com.lakue.oburie.model.retrofit.ResponseResultFail

data class ResponseJoin(
    @SerializedName("result") val result: Boolean,
    @SerializedName("data") val data: ResponseJoinData,
    @SerializedName("fail") val fail: ResponseResultFail
)
