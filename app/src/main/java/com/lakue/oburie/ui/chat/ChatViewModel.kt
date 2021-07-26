package com.lakue.oburie.ui.chat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.chat.Chatting
import com.lakue.oburie.test.*
import com.lakue.oburie.ui.jobhunter.location.SelectLocationActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity
import com.lakue.oburie.utils.BaseUtils
import com.lakue.oburie.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    private val _chatData = MutableLiveData<ArrayList<Chatting>>()
    val chatData: LiveData<ArrayList<Chatting>> = _chatData

    val chatEdit = MutableLiveData<String>("")

    private val _userProfileDetailEvent = MutableLiveData<Event<String>>()
    val userProfileDetailEvent: LiveData<Event<String>> = _userProfileDetailEvent

    var chatAdapter: ChatAdapter = ChatAdapter(this)

    init {
        val chatArray = ArrayList<Chatting>()
        chatArray.addFrontAfterCheck(testChatting1)
        chatArray.addFrontAfterCheck(testChatting2)
        chatArray.addFrontAfterCheck(testChatting21)
        chatArray.addFrontAfterCheck(testChatting22)
        chatArray.addFrontAfterCheck(testChatting23)
        chatArray.addFrontAfterCheck(testChatting221)
        chatArray.addFrontAfterCheck(testChatting3)
        chatArray.addFrontAfterCheck(testChatting5)

        _chatData.value = chatArray

        chatAdapter.setCount(_chatData.value!!.size)
    }

    fun onProfileDetail(){
        _userProfileDetailEvent.value = Event("")
    }

    fun showSelectLocation() {
        SelectLocationActivity.startSelectLocationActivity(BaseUtils.context)
    }

    fun showUserDetail() {
        UserProfileActivity.startUserProfileActivity(BaseUtils.context)
    }

    fun ArrayList<Chatting>.addFrontAfterCheck(chat: Chatting) {
        if(this.size > 0){
            val beforeIndex = this.size-1
            if(this[beforeIndex].type == chat.type){
                //바로 전의 데이터와 타입이 다를 경우
                if(this[beforeIndex].date == chat.date){
                    if(this[beforeIndex].dateState == "END"){
                        this[beforeIndex].dateState = "NORMAL"
                    } else if(this[beforeIndex].dateState == "ALL"){
                        this[beforeIndex].dateState = "START"
                    }
                    chat.dateState = "END"
                    this.add(chat)
                } else {
                    chat.dateState = "ALL"
                    this.add(chat)
                }
            } else {
                //바로 전의 데이터와 타입이 다를 경우, 이전 데이터 상태를 END로 변경
                chat.dateState = "ALL"
                this.add(chat)
            }
        } else {
            //라스트가 처음 들어왔을 경우
            chat.dateState = "ALL"
            this.add(chat)
        }
    }

}