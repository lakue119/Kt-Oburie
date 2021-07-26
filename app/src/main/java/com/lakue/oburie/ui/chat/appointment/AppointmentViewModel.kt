package com.lakue.oburie.ui.chat.appointment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AppointmentViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    val meetDate = MutableLiveData<String>("날짜를 선택해주세요.")

}