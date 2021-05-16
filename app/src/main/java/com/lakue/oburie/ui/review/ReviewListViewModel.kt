package com.lakue.oburie.ui.review

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.Review
import com.lakue.oburie.test.testReview1
import com.lakue.oburie.test.testReview2
import com.lakue.oburie.test.testReview3
import com.lakue.oburie.test.testuserProfileDetail
import javax.inject.Inject

class ReviewListViewModel  @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    val reviewAdapter = ReviewListAdapter(this)

    private val _review = MutableLiveData<ArrayList<Review>>(arrayListOf(testReview1,testReview2,testReview3))
    val review: LiveData<ArrayList<Review>> = _review


    private val _profileData = MutableLiveData<Profile>(testuserProfileDetail)
    val profileData: LiveData<Profile> = _profileData

    init {
        reviewAdapter.dataCount = review.value!!.size
    }
}