package com.lakue.oburie.model

data class Profile(
        val badge: String,
        val major: String,
        val local: String,
        val reviewTotalGrade: Float,
        val reviewSatisfactionGrade: Float,
        val reviewTimeObservanceGrade: Float,
        val reviewCommunicationGrade: Float,
        val reviewCount: Int,
        val coverImgs: ArrayList<String>,
        val userInfo: UserInfo,
        val view: Int,
        val introduce: String,
        val career: String,
        val awards: String,
        val videos: ArrayList<String>,
        val title: String

)