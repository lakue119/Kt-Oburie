package com.lakue.oburie.ui.myresume.upload.detail

import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import javax.inject.Inject

class ResumeUploadDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {
    val Tag = ResumeUploadDetailViewModel::class.java.name
}