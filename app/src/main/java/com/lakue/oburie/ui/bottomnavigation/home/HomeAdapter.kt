package com.lakue.oburie.ui.bottomnavigation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.*
import com.lakue.oburie.model.Category
import com.lakue.oburie.model.Profile
import com.lakue.oburie.ui.bottomnavigation.home.category.HomeCategoryAdapter
import com.lakue.oburie.ui.bottomnavigation.home.group.HomeGroupAdapter
import com.lakue.oburie.ui.bottomnavigation.home.newface.HomeNewFaceAdapter
import com.lakue.oburie.ui.bottomnavigation.home.popular.HomePopularAdapter

class HomeAdapter(val viewModel: HomeViewModel) : BaseAdapter() {

    private val TYPE_BANNER = 1001
    private val TYPE_SEARCH = 1002
    private val TYPE_CATEGORY = 1003
    private val TYPE_NO_PROFILE = 1004
    private val TYPE_POPULAR = 1005
    private val TYPE_NEW_FACE = 1006
    private val TYPE_GROUP = 1007

    var dataCount = 0

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
            TYPE_SEARCH -> {
                DataBindingUtil.inflate<ItemHomeSearchBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_search,
                        parent,
                        false
                ).let {
                    return HomeSearchViewHolder(it)
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
                DataBindingUtil.inflate<ItemHomePopularListBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_popular_list,
                        parent,
                        false
                ).let {
                    return HomePopularProfileViewHolder(it)
                }
            }
            TYPE_NEW_FACE -> {
                DataBindingUtil.inflate<ItemHomeNewFaceListBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_new_face_list,
                        parent,
                        false
                ).let {
                    return HomeNewFaceProfileViewHolder(it)
                }
            }
            else -> {
                DataBindingUtil.inflate<ItemHomeGroupListBinding>(
                        LayoutInflater.from(parent.context),
                        R.layout.item_home_group_list,
                        parent,
                        false
                ).let {
                    return HomeGroupProfileViewHolder(it)
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
                return TYPE_SEARCH
            }
            2 -> {
                return TYPE_CATEGORY
            }
            3 -> {
                return TYPE_NO_PROFILE
            }
            4 -> {
                return TYPE_POPULAR
            }
            5 -> {
                return TYPE_NEW_FACE
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

    inner class HomeSearchViewHolder(private val binding: ItemHomeSearchBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                vm = viewModel
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

    inner class HomePopularProfileViewHolder(private val binding: ItemHomePopularListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val vm = item as HomeViewModel
                val profileAdapter = HomePopularAdapter(vm, vm.homeData.value?.get(pos) as ArrayList<Profile>)
                adapter = profileAdapter

            }
        }
    }

    inner class HomeNewFaceProfileViewHolder(private val binding: ItemHomeNewFaceListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val vm = item as HomeViewModel
                val profileAdapter = HomeNewFaceAdapter(vm, vm.homeData.value?.get(pos) as ArrayList<Profile>)
                adapter = profileAdapter

            }
        }
    }

    inner class HomeGroupProfileViewHolder(private val binding: ItemHomeGroupListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val vm = item as HomeViewModel
                val profileAdapter = HomeGroupAdapter(vm, vm.homeData.value?.get(pos) as ArrayList<Profile>)
                adapter = profileAdapter

            }
        }
    }
}