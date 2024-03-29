package com.lakue.oburie.model

import dagger.multibindings.IntoMap

data class Review(
    val userimg: String = "",
    val userName: String = "",
    val rating: Int = 0,
    val comment: String = "",
    val answerName: String = "",
    val answerDate: String = "",
    val answerComment: String = "",
    val isAnswer: Boolean = false,
    val createDate: String = ""
)