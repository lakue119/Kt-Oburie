package com.lakue.oburie.ui.userprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.categoryresult.CategoryResultAdapter
import javax.inject.Inject

class UserProfileViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {


    private val _profileData = MutableLiveData<Profile>()
    val profileData: LiveData<Profile> = _profileData

    var profileAdapter: UserProfileVideoAdapter = UserProfileVideoAdapter(this)
}