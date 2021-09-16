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
import com.lakue.oburie.model.retrofit.home.*
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

    val myItems = ArrayList<Any>()

//    fun setCount(count: Int) {
//        dataCount = count
//        notifyDataSetChanged()
//    }

    fun addItems(items: ArrayList<Any>){
        myItems.addAll(items)
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

    override fun getItemCount() = myItems.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(myItems[position], position)
    }

    override fun getItemViewType(position: Int): Int {
        when (myItems[position]) {
            is ResponseHomePopularity -> {return TYPE_POPULAR}
            is ResponseHomeNewface -> {return TYPE_NEW_FACE}
            is ResponseHomeTeamProfile -> {return TYPE_GROUP}
//            is ResponseHomeBanner -> {return TYPE_BANNER}
            is Boolean -> {return TYPE_NO_PROFILE}
            is String -> {return TYPE_SEARCH}
            is List<*> -> {
                return try{
                    if((this.myItems[position] as List<ResponseHomeBanner>).get(0) is ResponseHomeBanner){
                        TYPE_BANNER
                    } else {
                        TYPE_CATEGORY
                    }
                } catch (e: ClassCastException){
                    TYPE_CATEGORY
                }

            }
            else -> {return TYPE_GROUP}
//            else -> {return TYPE_CATEGORY}
//            0 -> {
//                return TYPE_BANNER
//            }
//            1 -> {
//                return TYPE_SEARCH
//            }
//            2 -> {
//                return TYPE_CATEGORY
//            }
//            3 -> {
//                return TYPE_NO_PROFILE
//            }
//            4 -> {
//                return TYPE_POPULAR
//            }
//            5 -> {
//                return TYPE_NEW_FACE
//            }
//            else -> {
//                return TYPE_GROUP
//            }
        }
    }

    /**
     * ViewHolder
     */
    inner class HomeBannerViewHolder(private val binding: ItemHomeBannerBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val data = item as List<ResponseHomeBanner>
                this.banner = data[0]
                this.vm = viewModel
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
                val data = item as List<ResponseHomeCategory>
                val cateAdapter = HomeCategoryAdapter(viewModel, data)
                adapter = cateAdapter
            }
        }
    }

    inner class HomeProfileCheckViewHolder(private val binding: ItemHomeProfileCheckBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                vm = viewModel
            }
        }
    }

    inner class HomePopularProfileViewHolder(private val binding: ItemHomePopularListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val data = item as ResponseHomePopularity
                val profileAdapter = HomePopularAdapter(viewModel, data.profile)
                adapter = profileAdapter
                vm = viewModel

            }
        }
    }

    inner class HomeNewFaceProfileViewHolder(private val binding: ItemHomeNewFaceListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val data = item as ResponseHomeNewface
                val profileAdapter = HomeNewFaceAdapter(viewModel, data.profile)
                adapter = profileAdapter
                vm = viewModel

            }
        }
    }

    inner class HomeGroupProfileViewHolder(private val binding: ItemHomeGroupListBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                val data = item as ResponseHomeTeamProfile
                val profileAdapter = HomeGroupAdapter(viewModel, data.profile)
                adapter = profileAdapter
                vm = viewModel

            }
        }
    }
}