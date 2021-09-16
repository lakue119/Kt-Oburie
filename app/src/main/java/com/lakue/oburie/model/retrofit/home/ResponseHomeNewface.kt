package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName

data class ResponseHomeNewface(
        @SerializedName("profile") val profile: List<ResponseHomeProfile>
)