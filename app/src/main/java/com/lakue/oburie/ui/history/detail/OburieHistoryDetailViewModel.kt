package com.lakue.oburie.ui.history.detail

import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import javax.inject.Inject

class OburieHistoryDetailViewModel@Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {
    val Tag = OburieHistoryDetailViewModel::class.java.name
}