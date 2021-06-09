package com.lakue.oburie.ui.chat.appointment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import javax.inject.Inject

class AppointmentViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    val meetDate = MutableLiveData<String>("날짜를 선택해주세요.")

}