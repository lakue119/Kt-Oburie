package com.lakue.oburie.model.chat

data class Conversation(
        val profileImg: String = "",
        val profileName: String = "",
        val profileMajor: String = "",
        val profileLocation: String = "",
        val lastChatContent: String = "",
        val lastChatDate: String = "",
)