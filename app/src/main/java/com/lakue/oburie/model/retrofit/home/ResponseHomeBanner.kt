package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName

data class ResponseHomeBanner(
        @SerializedName("banner_id") val bannerId: Int,
        @SerializedName("image") val image: String,
        @SerializedName("url") val url: String
)