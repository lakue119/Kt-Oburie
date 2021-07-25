package com.lakue.oburie.ui.userprofile.info

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemCategoryResultLargeBinding
import com.lakue.oburie.databinding.ItemProfileLargeBinding
import com.lakue.oburie.databinding.ItemUserProfileCoverBinding
import com.lakue.oburie.databinding.ItemUserProfileVideoBinding
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.userprofile.UserProfileViewModel

class UserInfoProfileAdapter(private val viewModel: UserInfoViewModel) : BaseAdapter() {

    val myItems = ArrayList<Profile>()

    fun addItem(item: ArrayList<Profile>){
        myItems.addAll(item)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemProfileLargeBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_profile_large,
            parent,
            false
        ).let {
            return UserInfoProfileViewHolder(it)
        }
    }

    override fun getItemCount() = myItems.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        (holder as UserInfoProfileViewHolder).onBind(myItems[position], position)
    }

    inner class UserInfoProfileViewHolder(private val binding: ItemProfileLargeBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = viewModel
                this.profile = item as Profile
                this.position = pos
            }
        }
    }

}