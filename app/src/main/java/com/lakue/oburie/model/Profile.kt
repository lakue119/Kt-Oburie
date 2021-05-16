package com.lakue.oburie.model

data class Profile(
        val badge: String = "",
        val major: String = "",
        val local: String = "",
        val reviewTotalGrade: Float = 0.0f,
        val reviewSatisfactionGrade: Float = 0.0f,
        val reviewTimeObservanceGrade: Float = 0.0f,
        val reviewCommunicationGrade: Float = 0.0f,
        val reviewCount: Int = 0,
        val coverImgs: ArrayList<String> = arrayListOf(""),
        val userInfo: UserInfo = UserInfo(),
        val view: Int = 0,
        val introduce: String = "",
        val career: String = "",
        val awards: String = "",
        val videos: ArrayList<String> = arrayListOf(""),
        val title: String = ""

)