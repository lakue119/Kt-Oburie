package com.lakue.oburie.ui.review.answer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Review
import com.lakue.oburie.test.testReview1
import com.lakue.oburie.test.testReview2
import com.lakue.oburie.test.testReview3
import javax.inject.Inject

class ReviewAnswerViewModel  @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    private val _review = MutableLiveData<Review>(testReview1)
    val review: LiveData<Review> = _review


}