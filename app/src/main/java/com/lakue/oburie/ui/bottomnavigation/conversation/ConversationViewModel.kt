package com.lakue.oburie.ui.bottomnavigation.conversation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.chat.Conversation
import com.lakue.oburie.model.joboffer.JobOffer
import com.lakue.oburie.test.testConversation1
import com.lakue.oburie.test.testJobOffer1
import com.lakue.oburie.ui.bottomnavigation.joboffer.JobOfferAdapter
import com.lakue.oburie.ui.joboffer.detail.JobOfferDetailActivity
import com.lakue.oburie.utils.BaseUtils
import com.lakue.oburie.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConversationViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _conversation = MutableLiveData<ArrayList<Conversation>>()
    val conversation: LiveData<ArrayList<Conversation>> = _conversation

    private val _detainEvent = MutableLiveData<Event<Conversation>>()
    val detainEvent: LiveData<Event<Conversation>> = _detainEvent

    var conversationAdapter: ConversationAdapter = ConversationAdapter(this)

    init {
        sampleHomeData()
    }

    fun sampleHomeData() {
        var sampleList = ArrayList<Conversation>()
        sampleList.add(testConversation1)
        for (i in 0..10) {
            sampleList.add(testConversation1)
        }
        _conversation.value = sampleList
        conversationAdapter.setCount(_conversation.value!!.size)
    }


    fun onDetailEvent(item: Conversation){
        _detainEvent.value = Event(item)
    }

}