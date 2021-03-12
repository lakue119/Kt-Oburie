package com.lakue.oburie.model

import androidx.lifecycle.MutableLiveData

data class Location(
        val code: Int,
        var location: String,
        var isSelect: Boolean
) {
}