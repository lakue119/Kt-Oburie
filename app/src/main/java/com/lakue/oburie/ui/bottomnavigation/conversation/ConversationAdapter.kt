package com.lakue.oburie.ui.bottomnavigation.conversation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemConversationBinding
import com.lakue.oburie.databinding.ItemJobOfferBinding
import com.lakue.oburie.model.joboffer.JobOfferBadge
import com.lakue.oburie.ui.bottomnavigation.home.HomeViewModel
import com.lakue.oburie.ui.bottomnavigation.joboffer.badge.JobOfferBadgeAdapter

class ConversationAdapter(val viewModel: ConversationViewModel) : BaseAdapter() {

    var dataCount = 0

    fun setCount(count: Int) {
        dataCount = count
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemConversationBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_conversation,
                parent,
                false
        ).let {
            return ConversationViewHolder(it)
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(viewModel, position)
    }

    /**
     * ViewHolder
     */
    inner class ConversationViewHolder(private val binding: ItemConversationBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = viewModel
                this.pos = adapterPosition
            }
        }
    }
}