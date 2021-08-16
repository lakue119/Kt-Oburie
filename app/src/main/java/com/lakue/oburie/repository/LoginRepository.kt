package com.lakue.oburie.repository

import com.lakue.oburie.api.ApiHelper
import java.util.HashMap
import javax.inject.Inject

class LoginRepository @Inject constructor(private val apiHelper: ApiHelper){
    suspend fun getLoginCheck(id: String, type: String) = apiHelper.getLoginCheck(id, type)
    suspend fun postJoin(parameters: HashMap<String, Any>) = apiHelper.postJoin(parameters)
}