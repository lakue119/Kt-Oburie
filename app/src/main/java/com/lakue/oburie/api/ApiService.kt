package com.lakue.oburie.api

import com.lakue.oburie.model.retrofit.login.ResponseJoin
import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import retrofit2.Response
import retrofit2.http.*
import java.util.HashMap

interface ApiService {

    @GET("/user/login")
    suspend fun getLoginCheck(
        @Query("id") id: String,
        @Query("type") type: String
    ): Response<ResponseJoinCheck>

    @FormUrlEncoded
    @Headers(
        "Content-Type: application/json",
        "Accept: application/json",
        "bearer: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6NDR9.Ztir8nvZ4jGAOdnqCm177hrQ0w-_TYBomuwydpXZm60",
        "Transfer-Encoding: chunked",
        "Date: Mon, 13 Sep 2021 13:53:23 GMT",
        "Keep-Alive: timeout=60",
        "Connection: keep-alive"
    )
    @POST("/user")
    suspend fun postJoin(@FieldMap parameters: HashMap<String, Any>): Response<ResponseJoin>

}