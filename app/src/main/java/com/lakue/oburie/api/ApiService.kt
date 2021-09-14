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
    @POST("/user")
    suspend fun postJoin(@FieldMap parameters: HashMap<String, Any>): Response<ResponseJoin>

}