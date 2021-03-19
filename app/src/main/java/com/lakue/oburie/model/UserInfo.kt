package com.lakue.oburie.model

data class UserInfo(
        val nickName: String,
        val introduct: String,
        val webSite: String,
        val instagram: String,
        val youtube: String,
        val twitter: String,
        val facebook: String,
        val userProfile: String
){
    constructor(): this("","", "", "", "", "", "", "")
}