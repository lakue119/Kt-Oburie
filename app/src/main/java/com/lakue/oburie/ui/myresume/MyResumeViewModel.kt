package com.lakue.oburie.ui.myresume

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.test.testResume
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyResumeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {
    val resumeAdapter = MyResumeAdapter(this)

    private val _resume = MutableLiveData<ArrayList<Any>>(testResume)
    val resume: LiveData<ArrayList<Any>> = _resume

    init {
        resumeAdapter.dataCount = resume.value!!.size
    }

}