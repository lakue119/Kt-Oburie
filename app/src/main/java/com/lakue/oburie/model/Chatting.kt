package com.lakue.oburie.model

data class Chatting(
    val idx: Int = 0,
    val text: String = "",
    val date: String = "",
    val type: String = "",
    val locationTitle: String = "",
    val meetingDate: String = "",
    val meetingStartTime: String = "",
    val meetingNeedTime: String = "",
    val profileImg: String = "",
    val profileName: String = "",
    val lat: Double = 0.0,
    val lnt: Double = 0.0,
    val state: String = ""
)
