package com.lakue.oburie.ui.bottomnavigation.joboffer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.joboffer.JobOffer
import com.lakue.oburie.test.testJobOffer1
import com.lakue.oburie.ui.joboffer.detail.JobOfferDetailActivity.Companion.startJobOfferDetailActivity
import com.lakue.oburie.utils.BaseUtils.context
import com.lakue.oburie.utils.Event
import javax.inject.Inject

class JobOfferViewModel  @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _jobOffer = MutableLiveData<ArrayList<JobOffer>>()
    val jobOffer: LiveData<ArrayList<JobOffer>> = _jobOffer

    val banner = ""

    var jobOfferAdapter: JobOfferAdapter = JobOfferAdapter(this)


    private val _jobOfferDetailEvent = MutableLiveData<Event<String>>()
    val jobOfferDetailEvent: LiveData<Event<String>> = _jobOfferDetailEvent

    private val _userProfileDetailEvent = MutableLiveData<Event<String>>()
    val userProfileDetailEvent: LiveData<Event<String>> = _userProfileDetailEvent

    init {
        sampleHomeData()
    }

    fun sampleHomeData() {
        var sampleList = ArrayList<JobOffer>()
        sampleList.add(testJobOffer1)
        for(i in 0..10){
            sampleList.add(testJobOffer1)
        }
        _jobOffer.value = sampleList
        jobOfferAdapter.setCount(_jobOffer.value!!.size)
    }

    fun onDetail(){
        _jobOfferDetailEvent.value = Event("")
    }

    fun onProfileDetail(){
        _userProfileDetailEvent.value = Event("")
    }

}