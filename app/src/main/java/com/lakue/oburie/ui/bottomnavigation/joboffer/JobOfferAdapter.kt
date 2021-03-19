package com.lakue.oburie.ui.bottomnavigation.joboffer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemHomeNewFaceBinding
import com.lakue.oburie.databinding.ItemJobOfferBinding
import com.lakue.oburie.model.Category
import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.joboffer.JobOffer
import com.lakue.oburie.model.joboffer.JobOfferBadge
import com.lakue.oburie.ui.bottomnavigation.home.HomeViewModel
import com.lakue.oburie.ui.bottomnavigation.home.category.HomeCategoryAdapter
import com.lakue.oburie.ui.bottomnavigation.joboffer.badge.JobOfferBadgeAdapter

class JobOfferAdapter (val viewModel: JobOfferViewModel) : BaseAdapter() {

    var dataCount = 0

    fun setCount(count: Int) {
        dataCount = count
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemJobOfferBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_job_offer,
                parent,
                false
        ).let {
            return JobOfferViewHolder(it)
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(viewModel, position)
    }

    /**
     * ViewHolder
     */
    inner class JobOfferViewHolder(private val binding: ItemJobOfferBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = viewModel
                this.pos = adapterPosition
                val jobOfferBadgeAdapter = JobOfferBadgeAdapter(viewModel, viewModel.jobOffer.value?.get(adapterPosition)?.badge as ArrayList<JobOfferBadge>)
                adapter = jobOfferBadgeAdapter
            }
        }
    }
}