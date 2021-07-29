package com.lakue.oburie.api

import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/user/login/{id}/{type}")
    suspend fun getLoginCheck(
        @Query("id") id: String,
        @Query("type") type: String
    ): Response<ResponseJoinCheck>
}