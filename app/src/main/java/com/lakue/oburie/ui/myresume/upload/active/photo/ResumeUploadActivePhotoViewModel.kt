package com.lakue.oburie.ui.myresume.upload.active.photo

import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResumeUploadActivePhotoViewModel  @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {
    val Tag = ResumeUploadActivePhotoViewModel::class.java.name

}