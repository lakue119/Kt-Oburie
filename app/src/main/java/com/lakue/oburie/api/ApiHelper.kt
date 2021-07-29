package com.lakue.oburie.api

import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import retrofit2.Response

interface ApiHelper {
    suspend fun getLoginCheck(id: String, type: String): Response<ResponseJoinCheck>
}