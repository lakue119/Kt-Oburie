package com.lakue.oburie.ui.chat

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityChatBinding
import com.lakue.oburie.ui.jobhunter.searchlist.JobHunterSearchActivity

class ChatActivity : BaseActivity<ActivityChatBinding, ChatViewModel>(R.layout.activity_chat) {

    companion object {
        fun startChatActivity(
            context: Context
        ) {
            val intent = Intent(context, ChatActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@ChatActivity
            headTitle = "'라꾸'님과의 대화"
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }
}