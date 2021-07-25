package com.lakue.oburie.ui.joboffer.mine

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemCategoryResultLargeBinding
import com.lakue.oburie.databinding.ItemCategoryResultSmallBinding
import com.lakue.oburie.databinding.ItemMyJobOfferBinding
import com.lakue.oburie.databinding.ItemMyJobOfferTextBinding
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.expert.ExpertViewModel

class MyJobOfferAdapter(private val viewModel: MyJobOfferViewModel) : BaseAdapter() {

    private val TYPE_TEXT = 1001
    private val TYPE_POST = 1002

    val myItems = ArrayList<Profile>()

    fun addItem(item: ArrayList<Profile>){
        myItems.addAll(item)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when (viewType) {
            TYPE_TEXT -> {
                DataBindingUtil.inflate<ItemMyJobOfferTextBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_my_job_offer_text,
                        parent,
                        false
                ).let {
                    return MyJobOfferTextViewHolder(it)
                }
            }
            else -> {
                DataBindingUtil.inflate<ItemMyJobOfferBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_my_job_offer,
                        parent,
                        false
                ).let {
                    return MyJobOfferViewHolder(it)
                }
            }
        }
    }

    override fun getItemCount() = myItems.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(myItems[position], position)
    }

    override fun getItemViewType(position: Int): Int {
        return if(position > 0){
            TYPE_POST
        } else {
            TYPE_TEXT
        }
    }

    /**
     * ViewHolder
     */
    inner class MyJobOfferTextViewHolder(private val binding: ItemMyJobOfferTextBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
//                this.vm = viewModel
//                this.profile = item as Profile
//                this.position = pos
            }
        }
    }

    inner class MyJobOfferViewHolder(private val binding: ItemMyJobOfferBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
//                this.vm = viewModel
//                this.profile = item as Profile
//                this.position = pos
            }
        }
    }
}