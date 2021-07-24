package com.lakue.oburie.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.ui.jobhunter.list.JobHunterAdapter
import com.lakue.oburie.ui.jobhunter.location.SelectLocationActivity.Companion.startSelectLocationActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import com.lakue.oburie.utils.BaseUtils.context
import com.lakue.oburie.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OburieHistoryViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    //마이프로필 이동 Event
    private val _showMyProfileEvent = MutableLiveData<Event<String>>()
    val showMyProfileEvent: LiveData<Event<String>> = _showMyProfileEvent

    //거래취소 Event
    private val _cancelEvent = MutableLiveData<Event<String>>()
    val cancelEvent: LiveData<Event<String>> = _cancelEvent

    //거래확정 Event
    private val _confiemEvent = MutableLiveData<Event<String>>()
    val confiemEvent: LiveData<Event<String>> = _confiemEvent

    //리뷰작성페이지 이동 Event
    private val _editReviewEvent = MutableLiveData<Event<String>>()
    val editReviewEvent: LiveData<Event<String>> = _editReviewEvent

    //상대페이디 이동 Event
    private val _showUserPageEvent = MutableLiveData<Event<String>>()
    val showUserPageEvent: LiveData<Event<String>> = _showUserPageEvent

    //상대페이디 이동 Event
    private val _showDetail = MutableLiveData<Event<String>>()
    val showDetail: LiveData<Event<String>> = _showDetail

    fun onShowMyProfile(){
        _showMyProfileEvent.value = Event("onShowMyProfile")
    }

    fun onCancel(){
        _cancelEvent.value = Event("onCancel")
    }

    fun onConfirm(){
        _confiemEvent.value = Event("onConfirm")
    }

    fun onEditReview(){
        _editReviewEvent.value = Event("onEditReview")
    }

    fun onShowUserProfile(){
        _showUserPageEvent.value = Event("onShowUserProfile")
    }

    fun onShowDetail(){
        _showDetail.value = Event("onShowDetail")
    }
}