package com.lakue.oburie.ui.bottomnavigation.home.popular

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemHomePopularBinding
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.bottomnavigation.home.HomeViewModel

class HomePopularAdapter(val viewModel: HomeViewModel, profile: ArrayList<Profile>) : BaseAdapter() {

    val profiles = profile

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemHomePopularBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_home_popular,
            parent,
            false
        ).let {
            return HomeProfileItemViewHolder(it)
        }
    }

    override fun getItemCount() = profiles.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(profiles[position], position)
    }

    /**
     * ViewHolder
     */
    inner class HomeProfileItemViewHolder(private val binding: ItemHomePopularBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.profile = item as Profile
                this.vm = viewModel
            }
        }
    }
}