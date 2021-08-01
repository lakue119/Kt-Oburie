package com.lakue.oburie.api

import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("/user/login/{id}/{type}")
    suspend fun getLoginCheck(
        @Path("id") id: String,
        @Path("type") type: String
    ): Response<ResponseJoinCheck>
}