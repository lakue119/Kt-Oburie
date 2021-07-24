package com.lakue.oburie.ui.jobhunter.searchlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemCategoryResultLargeBinding
import com.lakue.oburie.databinding.ItemCategoryResultSmallBinding
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.expert.ExpertViewModel


class JobHunterSearchAdapter(private val viewModel: ExpertViewModel) : BaseAdapter() {

    private val TYPE_LARGE = 1001
    private val TYPE_SMALL = 1002

    val myItems = ArrayList<Profile>()

    fun addItem(item: ArrayList<Profile>){
        myItems.addAll(item)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when (viewType) {
            TYPE_LARGE -> {
                DataBindingUtil.inflate<ItemCategoryResultLargeBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.item_category_result_large,
                    parent,
                    false
                ).let {
                    return CategoryResultLargeViewHolder(it)
                }
            }
            else -> {
                DataBindingUtil.inflate<ItemCategoryResultSmallBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.item_category_result_small,
                    parent,
                    false
                ).let {
                    return CategoryResultSmallViewHolder(it)
                }
            }
        }
    }

    override fun getItemCount() = myItems.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(myItems[position], position)
    }

    override fun getItemViewType(position: Int): Int {
        return if(position > 1){
            TYPE_SMALL
        } else {
            TYPE_LARGE
        }
    }

    /**
     * ViewHolder
     */
    inner class CategoryResultLargeViewHolder(private val binding: ItemCategoryResultLargeBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = viewModel
                this.profile = item as Profile
                this.position = pos
            }
        }
    }

    inner class CategoryResultSmallViewHolder(private val binding: ItemCategoryResultSmallBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = viewModel
                this.profile = item as Profile
                this.position = pos
            }
        }
    }
}