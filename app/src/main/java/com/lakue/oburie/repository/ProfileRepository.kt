package com.lakue.oburie.repository

import com.lakue.oburie.api.ApiHelper
import javax.inject.Inject

class ProfileRepository @Inject constructor(private val apiHelper: ApiHelper){
    suspend fun getLoginCheck(id: String, type: String) = apiHelper.getLoginCheck(id, type)
}