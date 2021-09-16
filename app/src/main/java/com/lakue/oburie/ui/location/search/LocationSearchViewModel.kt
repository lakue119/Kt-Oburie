package com.lakue.oburie.ui.location.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.retrofit.login.ResponseJoin
import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import com.lakue.oburie.repository.RetrofitRepository
import com.lakue.oburie.utils.NetworkHelper
import com.lakue.oburie.utils.loading.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.net.SocketTimeoutException
import javax.inject.Inject

@HiltViewModel
class LocationSearchViewModel  @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: RetrofitRepository
) : BaseViewModel() {

    private val _loginCheck = MutableLiveData<Resource<ResponseJoinCheck>>()
    val loginCheck: LiveData<Resource<ResponseJoinCheck>> = _loginCheck

    private val _join = MutableLiveData<Resource<ResponseJoin>>()
    val join: LiveData<Resource<ResponseJoin>> = _join

    val liveName = MutableLiveData<String>("")

    var loginType = ""
    var loginId = ""


    fun fetchLoginCheck(id: String, type: String){
        loginType = type
        loginId = id
        viewModelScope.launch {
            if(NetworkHelper.isNetworkConnected()){
                try{
                    repository.getLoginCheck(id, type).let { response ->
                        if(response.isSuccessful){
                            val data = Resource.success(response.body()).data
                            _loginCheck.postValue(Resource.success(response.body()))
                        } else {
                            _loginCheck.postValue(Resource.error("ERROR CODE: ${response.code()}\n${response.message()}", null))
                        }
                    }
                } catch (e: SocketTimeoutException){
                    _loginCheck.postValue(Resource.timeoutError())
                }
            } else {
                _loginCheck.postValue(Resource.networtError())
            }
        }
    }

}