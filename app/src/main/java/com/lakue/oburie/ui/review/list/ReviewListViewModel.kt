package com.lakue.oburie.ui.review.list

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
import com.lakue.oburie.ui.review.list.ReviewListAdapter
import com.lakue.oburie.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ReviewListViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    val reviewAdapter = ReviewListAdapter(this)

    private val _review = MutableLiveData<ArrayList<Review>>(arrayListOf(testReview1, testReview2, testReview3))
    val review: LiveData<ArrayList<Review>> = _review

    private val _reviewAnswerEvent = MutableLiveData<Event<Review>>()
    val reviewAnswerEvent: LiveData<Event<Review>> = _reviewAnswerEvent

    private val _userProfileEvent = MutableLiveData<Event<Int>>()
    val userProfileEvent: LiveData<Event<Int>> = _userProfileEvent

    private val _profileData = MutableLiveData<Profile>(testuserProfileDetail)
    val profileData: LiveData<Profile> = _profileData

    init {
        reviewAdapter.dataCount = review.value!!.size
    }

    fun reviewAnswerEvent(review: Review) {
        _reviewAnswerEvent.value = Event(review)
    }

    fun userProfileEvent() {
        _userProfileEvent.value = Event(1)
    }
}