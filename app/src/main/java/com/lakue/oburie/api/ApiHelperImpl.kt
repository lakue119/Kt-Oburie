//package com.lakue.oburie.api
//
//import com.lakue.oburie.model.retrofit.home.ResponseHomeMain
//import com.lakue.oburie.model.retrofit.login.ResponseJoin
//import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
//import retrofit2.Response
//import java.util.HashMap
//import javax.inject.Inject
//
//class ApiHelperImpl @Inject constructor(
//    private val apiService: ApiService) : ApiHelper {
//
//    override suspend fun getLoginCheck(id: String, type: String): Response<ResponseJoinCheck> =
//        apiService.getLoginCheck(id,type)
//
//    override suspend fun postJoin(parameters: HashMap<String, Any>): Response<ResponseJoin> =
//        apiService.postJoin(parameters)
//
//    override suspend fun getHomeMain(): Response<ResponseHomeMain> =
//            apiService.getHomeMain()
//}