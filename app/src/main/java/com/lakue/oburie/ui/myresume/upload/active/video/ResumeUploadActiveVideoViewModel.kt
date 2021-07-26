package com.lakue.oburie.ui.myresume.upload.active.video

import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResumeUploadActiveVideoViewModel  @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {
    val Tag = ResumeUploadActiveVideoViewModel::class.java.name
}