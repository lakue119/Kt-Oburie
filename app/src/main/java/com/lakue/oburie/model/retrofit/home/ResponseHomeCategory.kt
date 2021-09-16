package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName

data class ResponseHomeCategory(
        @SerializedName("category_id") val categoryId: Int,
        @SerializedName("category_name") val categoryName: String,
        @SerializedName("image") val image: String
)