package com.lakue.oburie.ui.myresume.upload.normal

import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.ui.bottomnavigation.home.category.HomeCategoryAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResumeUploadNormalViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {
    val Tag = ResumeUploadNormalViewModel::class.java.name

//    val adapter = UploadCategoryAdapter(this)
}