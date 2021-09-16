package com.lakue.oburie.model.retrofit.home

import com.google.gson.annotations.SerializedName

data class ResponseHomeProfile(
        @SerializedName("active_area") val activeArea: String,
        @SerializedName("activity_name") val activityName: String,
        @SerializedName("award_details") val awardDetails: String,
        @SerializedName("birth_year") val birthYear: String,
        @SerializedName("career") val career: String,
        @SerializedName("category_name") val categoryName: String,
        @SerializedName("communication_rating") val communicationRating: Double,
        @SerializedName("conviction_count") val convictionCount: Int,
        @SerializedName("gender") val gender: String,
        @SerializedName("grade") val grade: String,
        @SerializedName("introduction") val introduction: String,
        @SerializedName("nickname") val nickname: String,
        @SerializedName("popularity_rank") val popularityRank: Int,
        @SerializedName("popularity_score") val popularityScore: Int,
        @SerializedName("popularity_times") val popularityTimes: Int,
        @SerializedName("profile_enable_flag") val profileEnableFlag: String,
        @SerializedName("profile_image") val profileImage: List<ProfileImage>,
        @SerializedName("profile_type") val profileType: String,
        @SerializedName("rating") val rating: Int,
        @SerializedName("review_count") val reviewCount: Int,
        @SerializedName("satisfaction_rating") val satisfactionRating: Double,
        @SerializedName("specialized_field") val specializedField: String,
        @SerializedName("time_compliance_rating") val timeComplianceRating: Double,
        @SerializedName("total_rating") val totalRating: Double,
        @SerializedName("user_id") val userId: Int,
        @SerializedName("user_profile_id") val userProfileId: Int
)