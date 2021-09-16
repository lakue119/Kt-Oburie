package com.lakue.oburie.api

import com.lakue.oburie.model.retrofit.home.ResponseHomeMain
import com.lakue.oburie.model.retrofit.login.ResponseJoin
import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import retrofit2.Response
import retrofit2.http.*
import java.util.HashMap

interface ApiService {

    @GET("/user/login")
    suspend fun getLoginCheck(
        @Query("social_id") id: String,
        @Query("type") type: String
    ): Response<ResponseJoinCheck>

    @FormUrlEncoded
    @POST("/user")
    suspend fun postJoin(@FieldMap parameters: HashMap<String, Any>): Response<ResponseJoin>

//    @Headers("bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OSIsImlhdCI6MTYzMTcwODAyNywiZXhwIjoxNjMxNzQ0MDI3fQ.ted-k4R3Y6CCiUF0uHPBu8ap1k7MOf-7VvYBZtxGPuM")
    @GET("/main-page")
    suspend fun getHomeMain(): Response<ResponseHomeMain>
}