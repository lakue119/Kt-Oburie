package com.lakue.oburie.model.retrofit.login

data class ResponseJoinData(
    val user_id: Long = 0,
    val social_id: String = "",
    val social_type: String = "",
    val nickname: String = "",
    val grade: String = ""
)