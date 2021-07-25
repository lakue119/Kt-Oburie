package com.lakue.oburie.ui.bottomnavigation.conversation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentConversationBinding
import com.lakue.oburie.databinding.FragmentHomeBinding
import com.lakue.oburie.ui.bottomnavigation.home.HomeViewModel
import com.lakue.oburie.ui.chat.ChatActivity.Companion.startChatActivity
import com.lakue.oburie.ui.userprofile.info.UserInfoActivity.Companion.startUserInfoActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentConversation :
    BaseFragment<FragmentConversationBinding, ConversationViewModel>(R.layout.fragment_conversation) {

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentConversation()
    }

    override fun init() {
        binding.apply {
            vm = viewModel
        }
        viewModel.apply {
            detainEvent eventObserve { showChatDetail() }
            userProfileDetailEvent eventObserve { showUserProfileDetail() }
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    private fun showChatDetail() {
        startChatActivity(mContext)
    }

    private fun showUserProfileDetail() {
        startUserInfoActivity(mContext)
    }
}


