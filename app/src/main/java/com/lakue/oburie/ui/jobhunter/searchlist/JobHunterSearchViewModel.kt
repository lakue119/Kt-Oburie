package com.lakue.oburie.ui.jobhunter.searchlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.ui.jobhunter.list.JobHunterAdapter
import com.lakue.oburie.ui.jobhunter.location.SelectLocationActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity
import com.lakue.oburie.utils.BaseUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class JobHunterSearchViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _profileData = MutableLiveData<ArrayList<Profile>>()
    val profileData: LiveData<ArrayList<Profile>> = _profileData

    var profileAdapter: JobHunterSearchAdapter = JobHunterSearchAdapter(this)

    init {
        sampleProfileData()
    }

    fun sampleProfileData() {
        var sampleList = testCategoryResultProfile

        _profileData.value = sampleList
        profileAdapter.setCount(_profileData.value!!.size)
    }

    fun showSelectLocation() {
        SelectLocationActivity.startSelectLocationActivity(BaseUtils.context)
    }

    fun showUserDetail() {
        UserProfileActivity.startUserProfileActivity(BaseUtils.context)
    }

}