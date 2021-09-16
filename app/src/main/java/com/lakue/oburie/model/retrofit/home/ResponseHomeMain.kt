package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName
import com.lakue.oburie.model.retrofit.ResponseResultFail

data class ResponseHomeMain(
        @SerializedName("data") val data: ResponseHomeData,
        @SerializedName("result") val result: Boolean,
        @SerializedName("fail") val fail: ResponseResultFail
)