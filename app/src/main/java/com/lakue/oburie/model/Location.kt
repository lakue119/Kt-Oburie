package com.lakue.oburie.model

import androidx.lifecycle.MutableLiveData

data class Location(
        val code: Int = 0,
        var location: String = "",
        var isSelect: Boolean = false
) {
}