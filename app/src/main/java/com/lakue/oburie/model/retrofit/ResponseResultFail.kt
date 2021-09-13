package com.lakue.oburie.model.retrofit

import com.google.gson.annotations.SerializedName

data class ResponseResultFail(
    @SerializedName("status") val status: String = "",
    @SerializedName("code") val code: String = "",
    @SerializedName("message") val message: String = ""
)