package com.lakue.oburie.ui.expert

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
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExpertViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    fun showSelectLocation() {
        startSelectLocationActivity(context)
    }

    fun showUserDetail() {
        startUserProfileActivity(context)
    }

}