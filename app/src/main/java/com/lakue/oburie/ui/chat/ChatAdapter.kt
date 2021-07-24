package com.lakue.oburie.ui.chat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.*

class ChatAdapter(private val viewModel: ChatViewModel) : BaseAdapter() {

    private val TYPE_SEND = 1001
    private val TYPE_ANSWER = 1002
    private val TYPE_SEND_MAP = 1003
    private val TYPE_ANSWER_MAP = 1004
    private val TYPE_TEXT = 1005

    var dataCount = 0

    fun setCount(count: Int) {
        dataCount = count
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when (viewType) {
            TYPE_SEND -> {
                DataBindingUtil.inflate<ItemChatSendBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_chat_send,
                        parent,
                        false
                ).let {
                    return ChatSendViewHolder(it)
                }
            }
            TYPE_ANSWER -> {
                DataBindingUtil.inflate<ItemChatAnswerBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_chat_answer,
                        parent,
                        false
                ).let {
                    return ChatAnswerViewHolder(it)
                }
            }
            TYPE_SEND_MAP -> {
                DataBindingUtil.inflate<ItemChatSendMapBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_chat_send_map,
                        parent,
                        false
                ).let {
                    return ChatSendMapViewHolder(it)
                }
            }
            TYPE_ANSWER_MAP -> {
                DataBindingUtil.inflate<ItemChatAnswerMapBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_chat_answer_map,
                        parent,
                        false
                ).let {
                    return ChatAnswerMapViewHolder(it)
                }
            }
            else -> {
                DataBindingUtil.inflate<ItemChatTextBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_chat_text,
                        parent,
                        false
                ).let {
                    return ChatMessageViewHolder(it)
                }
            }
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(viewModel, position)
    }

    override fun getItemViewType(position: Int): Int {
        when (viewModel.chatData.value!![position].type) {
            "SEND" -> {
                return TYPE_SEND
            }
            "ANSWER" -> {
                return TYPE_ANSWER
            }
            "SEND_MAP" -> {
                return TYPE_SEND_MAP
            }
            "ANSWER_MAP" -> {
                return TYPE_ANSWER_MAP
            }
            else -> {
                return TYPE_TEXT
            }
        }
    }

    override fun onViewAttachedToWindow(holder: BaseViewHolder) {
        super.onViewAttachedToWindow(holder)
        when (holder) {
            is ChatSendViewHolder -> {
                holder.onAttach()
            }
            is ChatSendMapViewHolder -> {
                holder.onAttach()
            }
            is ChatAnswerViewHolder -> {
                holder.onAttach()
            }
            is ChatAnswerMapViewHolder -> {
                holder.onAttach()
            }
            is ChatMessageViewHolder -> {
                holder.onAttach()
            }
        }
    }

    override fun onViewDetachedFromWindow(holder: BaseViewHolder) {
        super.onViewDetachedFromWindow(holder)
        when (holder) {
            is ChatSendViewHolder -> {
                holder.onDetach()
            }
            is ChatSendMapViewHolder -> {
                holder.onDetach()
            }
            is ChatAnswerViewHolder -> {
                holder.onDetach()
            }
            is ChatAnswerMapViewHolder -> {
                holder.onDetach()
            }
            is ChatMessageViewHolder -> {
                holder.onDetach()
            }
        }
    }


    /**
     * ViewHolder
     */
    inner class ChatSendViewHolder(private val binding: ItemChatSendBinding) : BaseViewHolder(binding.root), LifecycleOwner {
        private val lifecycleRegistry by lazy { LifecycleRegistry(this) }
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                lifecycleOwner = this@ChatSendViewHolder
                this.vm = item as ChatViewModel
                this.position = pos
            }
        }

        fun onAttach() {
            lifecycleRegistry.markState(Lifecycle.State.RESUMED)
        }

        fun onDetach() {
            lifecycleRegistry.markState(Lifecycle.State.CREATED)
        }

        override fun getLifecycle(): Lifecycle = lifecycleRegistry
    }

    inner class ChatSendMapViewHolder(private val binding: ItemChatSendMapBinding) : BaseViewHolder(binding.root), LifecycleOwner {
        private val lifecycleRegistry by lazy { LifecycleRegistry(this) }
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                lifecycleOwner = this@ChatSendMapViewHolder
                this.vm = item as ChatViewModel
                this.position = pos
            }
        }

        fun onAttach() {
            lifecycleRegistry.markState(Lifecycle.State.RESUMED)
        }

        fun onDetach() {
            lifecycleRegistry.markState(Lifecycle.State.CREATED)
        }

        override fun getLifecycle(): Lifecycle = lifecycleRegistry
    }

    inner class ChatAnswerViewHolder(private val binding: ItemChatAnswerBinding) : BaseViewHolder(binding.root), LifecycleOwner {
        private val lifecycleRegistry by lazy { LifecycleRegistry(this) }
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                lifecycleOwner = this@ChatAnswerViewHolder
                this.vm = item as ChatViewModel
                this.position = pos
            }
        }

        fun onAttach() {
            lifecycleRegistry.markState(Lifecycle.State.RESUMED)
        }

        fun onDetach() {
            lifecycleRegistry.markState(Lifecycle.State.CREATED)
        }

        override fun getLifecycle(): Lifecycle = lifecycleRegistry
    }

    inner class ChatAnswerMapViewHolder(private val binding: ItemChatAnswerMapBinding) : BaseViewHolder(binding.root), LifecycleOwner {
        private val lifecycleRegistry by lazy { LifecycleRegistry(this) }
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                lifecycleOwner = this@ChatAnswerMapViewHolder
                this.vm = item as ChatViewModel
                this.position = pos
            }
        }

        fun onAttach() {
            lifecycleRegistry.markState(Lifecycle.State.RESUMED)
        }

        fun onDetach() {
            lifecycleRegistry.markState(Lifecycle.State.CREATED)
        }

        override fun getLifecycle(): Lifecycle = lifecycleRegistry
    }

    inner class ChatMessageViewHolder(private val binding: ItemChatTextBinding) : BaseViewHolder(binding.root), LifecycleOwner {
        private val lifecycleRegistry by lazy { LifecycleRegistry(this) }
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                lifecycleOwner = this@ChatMessageViewHolder
                this.vm = item as ChatViewModel
                this.position = pos
            }
        }

        fun onAttach() {
            lifecycleRegistry.markState(Lifecycle.State.RESUMED)
        }

        fun onDetach() {
            lifecycleRegistry.markState(Lifecycle.State.CREATED)
        }

        override fun getLifecycle(): Lifecycle = lifecycleRegistry
    }
}