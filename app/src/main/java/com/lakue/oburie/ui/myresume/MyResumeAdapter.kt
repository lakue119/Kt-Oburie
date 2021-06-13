package com.lakue.oburie.ui.myresume

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemResumeBinding
import com.lakue.oburie.databinding.ItemResumeTypeBinding
import com.lakue.oburie.databinding.ItemReviewBinding
import com.lakue.oburie.ui.review.list.ReviewListViewModel

class MyResumeAdapter (private val viewModel: MyResumeViewModel) : BaseAdapter(){

    var dataCount = 0

    val TYPE_HEADER = 1001
    val TYPE_RESUME = 1002

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when(viewType){
            TYPE_HEADER -> {
                DataBindingUtil.inflate<ItemResumeTypeBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.item_resume_type,
                    parent,
                    false
                ).let {
                    return ResumeTypeViewHolder(it)
                }
            }

            else -> {
                DataBindingUtil.inflate<ItemResumeBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.item_resume,
                    parent,
                    false
                ).let {
                    return ResumeViewHolder(it)
                }
            }
        }

    }

    override fun getItemCount() = dataCount

    override fun getItemViewType(position: Int): Int {
        return if(viewModel.resume.value!![position] is String){
            TYPE_HEADER
        } else {
            TYPE_RESUME
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        when(holder){
            is ResumeTypeViewHolder -> {
                holder.onBind(viewModel, position)
            }
            is ResumeViewHolder -> {
                holder.onBind(viewModel, position)
            }
        }
    }

    inner class ResumeTypeViewHolder(private val binding: ItemResumeTypeBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = item as MyResumeViewModel
                this.pos = pos
            }
        }
    }

    inner class ResumeViewHolder(private val binding: ItemResumeBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = item as MyResumeViewModel
                this.pos = pos
            }
        }
    }

}