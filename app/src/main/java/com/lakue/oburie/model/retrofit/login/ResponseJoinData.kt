package com.lakue.oburie.model.retrofit.login

import com.google.gson.annotations.SerializedName

data class ResponseJoinData(
    @SerializedName("is_join") val isJoin: Boolean = false,
    @SerializedName("user_id") val userId: Long = 0,
    @SerializedName("social_id") val socialId: String = "",
    @SerializedName("social_type") val socialType: String = "",
    @SerializedName("nickname") val nickName: String = "",
    @SerializedName("grade") val grade: String = "",
    @SerializedName("token") val token: String = ""
)