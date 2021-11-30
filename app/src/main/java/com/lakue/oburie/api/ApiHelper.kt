//package com.lakue.oburie.api
//
//import com.lakue.oburie.model.retrofit.home.ResponseHomeMain
//import com.lakue.oburie.model.retrofit.login.ResponseJoin
//import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
//import retrofit2.Response
//import java.util.HashMap
//
//interface ApiHelper {
//    suspend fun getLoginCheck(id: String, type: String): Response<ResponseJoinCheck>
//    suspend fun postJoin(parameters: HashMap<String, Any>): Response<ResponseJoin>
//    suspend fun getHomeMain(): Response<ResponseHomeMain>
//}