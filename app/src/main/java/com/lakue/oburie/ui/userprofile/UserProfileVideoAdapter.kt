package com.lakue.oburie.ui.userprofile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemCategoryResultLargeBinding
import com.lakue.oburie.databinding.ItemUserProfileVideoBinding
import com.lakue.oburie.ui.categoryresult.CategoryResultViewModel

class UserProfileVideoAdapter(private val viewModel: UserProfileViewModel) : BaseAdapter() {

    var dataCount = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemUserProfileVideoBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_user_profile_video,
            parent,
            false
        ).let {
            return UserProfileVideoViewHolder(it)
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        (holder as UserProfileVideoViewHolder).onBind(viewModel, position)
    }

    inner class UserProfileVideoViewHolder(private val binding: ItemUserProfileVideoBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = item as UserProfileViewModel
                this.position = pos
            }
        }
    }

}