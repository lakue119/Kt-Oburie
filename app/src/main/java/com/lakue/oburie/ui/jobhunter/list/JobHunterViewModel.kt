package com.lakue.oburie.ui.jobhunter.list

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
class JobHunterViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _profileData = MutableLiveData<ArrayList<Profile>>()
    val profileData: LiveData<ArrayList<Profile>> = _profileData

    var profileAdapter: JobHunterAdapter = JobHunterAdapter(this)

    init {
        sampleProfileData()
    }

    fun sampleProfileData() {
        var sampleList = testCategoryResultProfile

        _profileData.value = sampleList
        profileAdapter.setCount(_profileData.value!!.size)
    }

    fun showSelectLocation() {
        startSelectLocationActivity(context)
    }

    fun showUserDetail() {
        startUserProfileActivity(context)
    }

}