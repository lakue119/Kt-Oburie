package com.lakue.oburie.ui.joboffer.upload

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class JobOfferUploadViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {
    val meetDate = MutableLiveData<String>("날짜를 선택해주세요.")
    val gender = MutableLiveData("무관")
    val traffic = MutableLiveData("예")

    fun setGender(view: View){
        gender.postValue(view.tag.toString())
    }
    fun setTraffic(view: View){
        traffic.postValue(view.tag.toString())
    }
}