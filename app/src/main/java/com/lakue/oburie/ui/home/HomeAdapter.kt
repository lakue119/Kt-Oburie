package com.lakue.oburie.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemHomeBannerBinding
import com.lakue.oburie.databinding.ItemHomeCategoryListBinding
import com.lakue.oburie.databinding.ItemHomePopularBinding
import com.lakue.oburie.databinding.ItemHomeProfileCheckBinding
import com.lakue.oburie.model.Category
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.home.category.HomeCategoryAdapter
import com.lakue.oburie.ui.home.popular.HomePopularAdapter

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
            TYPE_CATEGORY -> {
                DataBindingUtil.inflate<ItemHomeCategoryListBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_category_list,
                        parent,
                        false
                ).let {
                    return HomeCategoryListViewHolder(it)
                }
            }
            TYPE_NO_PROFILE -> {
                DataBindingUtil.inflate<ItemHomeProfileCheckBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_profile_check,
                        parent,
                        false
                ).let {
                    return HomeProfileCheckViewHolder(it)
                }
            }
            TYPE_POPULAR -> {
                DataBindingUtil.inflate<ItemHomePopularBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_popular,
                        parent,
                        false
                ).let {
                    return HomePopularProfileViewHolder(it)
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
        override fun onBind(vm: Any, pos: Int) {
            binding.apply {
                this.vm = vm as HomeViewModel
                this.position = pos
            }
        }
    }
    inner class HomeCategoryListViewHolder(private val binding: ItemHomeCategoryListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val vm = item as HomeViewModel
                val cateAdapter = HomeCategoryAdapter(vm, vm.homeData.value?.get(pos) as ArrayList<Category>)
                adapter = cateAdapter
            }
        }
    }

    inner class HomeProfileCheckViewHolder(private val binding: ItemHomeProfileCheckBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
            }
        }
    }

    inner class HomePopularProfileViewHolder(private val binding: ItemHomePopularBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val vm = item as HomeViewModel
                val profileAdapter = HomePopularAdapter(vm, vm.homeData.value?.get(pos) as ArrayList<Profile>)
                adapter = profileAdapter

            }
        }
    }
}