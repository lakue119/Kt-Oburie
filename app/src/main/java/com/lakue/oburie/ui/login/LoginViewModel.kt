package com.lakue.oburie.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.retrofit.login.ResponseJoinCheck
import com.lakue.oburie.repository.ProfileRepository
import com.lakue.oburie.utils.NetworkHelper
import com.lakue.oburie.utils.loading.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.net.SocketTimeoutException
import javax.inject.Inject

@HiltViewModel
class LoginViewModel  @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: ProfileRepository
) : BaseViewModel() {

    private val _loginCheck = MutableLiveData<Resource<ResponseJoinCheck>>()
    val loginCheck: LiveData<Resource<ResponseJoinCheck>> = _loginCheck


    fun fetchLoginCheck(id: String, type: String){
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