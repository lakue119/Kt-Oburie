package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName

data class ProfileImage(
        @SerializedName("image") val image: String,
        @SerializedName("image_type") val imageType: String,
        @SerializedName("seq") val seq: Int
)