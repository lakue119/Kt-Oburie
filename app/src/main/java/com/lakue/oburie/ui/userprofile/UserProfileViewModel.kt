package com.lakue.oburie.ui.userprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.UserInfo
import com.lakue.oburie.test.testuserProfileDetail
import com.lakue.oburie.ui.categoryresult.CategoryResultAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserProfileViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {


    private val _profileData = MutableLiveData<Profile>(testuserProfileDetail)
    val profileData: LiveData<Profile> = _profileData

    var profileVideoAdapter: UserProfileVideoAdapter = UserProfileVideoAdapter(this)
    var profileCoverAdapter: UserProfileCoverImgAdapter = UserProfileCoverImgAdapter(this)

    init {
        profileVideoAdapter.dataCount = profileData.value!!.videos.size
        profileCoverAdapter.dataCount = profileData.value!!.coverImgs.size
    }
}