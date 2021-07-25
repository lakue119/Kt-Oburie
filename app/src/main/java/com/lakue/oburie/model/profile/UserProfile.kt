package com.lakue.oburie.model.profile

import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.UserInfo

data class UserProfile(
    val profile: ArrayList<Profile> = arrayListOf(Profile()),
    val userInfo: UserInfo = UserInfo()
)
