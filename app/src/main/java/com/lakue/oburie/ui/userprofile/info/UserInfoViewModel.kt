package com.lakue.oburie.ui.userprofile.info

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.test.testuserProfileDetail
import com.lakue.oburie.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserInfoViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    private val _profileDetailEvent = MutableLiveData<Event<String>>()
    val profileDetailEvent: LiveData<Event<String>> = _profileDetailEvent

    fun onProfile(){
        _profileDetailEvent.value = Event("")
    }
}