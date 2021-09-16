package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName

data class ResponseHomeData(
        @SerializedName("category") val category: List<ResponseHomeCategory>,
        @SerializedName("newface") val newface: ResponseHomeNewface,
        @SerializedName("popularity_rank_list") val popularityRrankList: ResponseHomePopularity,
        @SerializedName("team_profile_list") val teamProfileList: ResponseHomeTeamProfile,
        @SerializedName("user_profile_exists") val userProfileExists: Boolean,
        @SerializedName("banner") val banner: List<ResponseHomeBanner>
)