package com.lakue.oburie.ui.bottomnavigation.home.group

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemHomeGroupBinding
import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.retrofit.home.ResponseHomeProfile
import com.lakue.oburie.ui.bottomnavigation.home.HomeViewModel

class HomeGroupAdapter(val viewModel: HomeViewModel, profile: List<ResponseHomeProfile>) : BaseAdapter() {

    val profiles = profile

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemHomeGroupBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_home_group,
                parent,
                false
        ).let {
            return HomeGroupViewHomder(it)
        }
    }

    override fun getItemCount() = profiles.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(profiles[position], position)
    }

    /**
     * ViewHolder
     */
    inner class HomeGroupViewHomder(private val binding: ItemHomeGroupBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.profile = item as ResponseHomeProfile
                this.vm = viewModel
            }
        }
    }
}