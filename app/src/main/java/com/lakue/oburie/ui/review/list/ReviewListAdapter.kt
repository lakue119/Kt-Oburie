package com.lakue.oburie.ui.review.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemReviewBinding

class ReviewListAdapter (private val viewModel: ReviewListViewModel) : BaseAdapter(){

    var dataCount = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemReviewBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_review,
            parent,
            false
        ).let {
            return ReviewViewHolder(it)
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        (holder as ReviewViewHolder).onBind(viewModel, position)
    }

    inner class ReviewViewHolder(private val binding: ItemReviewBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = item as ReviewListViewModel
                this.position = pos
            }
        }
    }

}