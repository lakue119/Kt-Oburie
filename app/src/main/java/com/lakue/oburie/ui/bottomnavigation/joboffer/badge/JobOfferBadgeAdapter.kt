package com.lakue.oburie.ui.bottomnavigation.joboffer.badge

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemBadgeBinding
import com.lakue.oburie.model.joboffer.JobOfferBadge
import com.lakue.oburie.ui.bottomnavigation.joboffer.JobOfferViewModel

class JobOfferBadgeAdapter (val viewModel: JobOfferViewModel, val badges: ArrayList<JobOfferBadge>) : BaseAdapter() {

    var badge = badges

    init {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemBadgeBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_badge,
                parent,
                false
        ).let {
            return JobOfferBadgeViewHolder(it)
        }
    }

    override fun getItemCount() = badge.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(badges[position], position)
    }

    /**
     * ViewHolder
     */
    inner class JobOfferBadgeViewHolder(private val binding: ItemBadgeBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos:Int) {
            binding.apply {
                this.vm = viewModel
                this.position = adapterPosition
                badge = item as JobOfferBadge
            }
        }
    }
}