package com.lakue.oburie.model

data class UserInfo(
        val nickName: String = "",
        val userProfileImg: String = "",
        val introduct: String = "",
        val webSite: String = "",
        val instagram: String = "",
        val youtube: String = "",
        val twitter: String = "",
        val facebook: String = ""
){
    constructor(): this("라꾸","https://pbs.twimg.com/profile_images/522969357756809217/qMc48ViZ_400x400.jpeg", "하이하이", "", "", "", "", "")
}