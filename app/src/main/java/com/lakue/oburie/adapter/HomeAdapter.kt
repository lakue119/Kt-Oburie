package com.lakue.oburie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.databinding.ItemHomeBannerBinding
import com.lakue.oburie.ui.home.HomeViewModel

class HomeAdapter(val viewModel: HomeViewModel) : BaseAdapter() {

    private val TYPE_BANNER = 1001
    private val TYPE_CATEGORY = 1002
    private val TYPE_NO_PROFILE = 1003
    private val TYPE_POPULAR = 1004
    private val TYPE_NEW_PEOPLE = 1005
    private val TYPE_GROUP = 1006

    var dataCount = 0
//    val myItems = ArrayList<Any>()

    //    fun addItem(item: ArrayList<Any>){
//        myItems.addAll(item)
//        notifyDataSetChanged()
//    }
    fun setCount(count: Int) {
        dataCount = count
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when (viewType) {
            TYPE_BANNER -> {
                DataBindingUtil.inflate<ItemHomeBannerBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_banner,
                        parent,
                        false
                ).let {
                    return HomeBannerViewHolder(it)
                }
            }
            else -> {
                DataBindingUtil.inflate<ItemHomeBannerBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_banner,
                        parent,
                        false
                ).let {
                    return HomeBannerViewHolder(it)
                }
            }
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(viewModel, position)
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
            0 -> {
                return TYPE_BANNER
            }
            1 -> {
                return TYPE_CATEGORY
            }
            2 -> {
                return TYPE_NO_PROFILE
            }
            3 -> {
                return TYPE_POPULAR
            }
            4 -> {
                return TYPE_NEW_PEOPLE
            }
            else -> {
                return TYPE_GROUP
            }
        }
    }

    /**
     * ViewHolder
     */
    inner class HomeBannerViewHolder(private val binding: ItemHomeBannerBinding) : BaseViewHolder(binding.root) {
        override fun onBind(vm: BaseViewModel, pos: Int) {
            binding.apply {
                this.vm = vm as HomeViewModel
                this.position = pos
            }
        }

    }
}