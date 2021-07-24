package com.lakue.oburie.ui.expert.like

import android.provider.ContactsContract
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

class LikeExpertAdapter(private val viewModel: ExpertViewModel) : BaseAdapter() {

    val myItems = ArrayList<Profile>()

    fun addItem(item: ArrayList<Profile>){
        myItems.addAll(item)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemCategoryResultSmallBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_category_result_small,
            parent,
            false
        ).let {
            return CategoryResultSmallViewHolder(it)
        }
    }

    override fun getItemCount() = myItems.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(myItems[position], position)
    }

    /**
     * ViewHolder
     */

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