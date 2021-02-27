package com.lakue.oburie.ui.home

import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.repository.ProfileRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val profileRepository: ProfileRepository
): BaseViewModel() {

}