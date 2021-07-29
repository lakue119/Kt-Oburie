package com.lakue.oburie.api

import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(
    private val apiService: ApiService) : ApiHelper {

    override suspend fun getLoginCheck(id: String, type: String): Response<ResponseJoinCheck> =
        apiService.getLoginCheck(id,type)

}