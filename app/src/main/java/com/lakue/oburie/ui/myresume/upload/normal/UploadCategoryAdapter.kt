package com.lakue.oburie.ui.myresume.upload.normal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemHomeCategoryBinding
import com.lakue.oburie.model.Category
import com.lakue.oburie.model.retrofit.home.ResponseHomeCategory
import com.lakue.oburie.ui.bottomnavigation.home.HomeViewModel

class UploadCategoryAdapter(val viewModel: ResumeUploadNormalViewModel, cate: ArrayList<ResponseHomeCategory>) : BaseAdapter() {

    val category = cate

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemHomeCategoryBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_home_category,
                parent,
                false
        ).let {
            return HomeCateGoryItemViewHolder(it)
        }
    }

    override fun getItemCount() = category.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(category[position], position)
    }

    /**
     * ViewHolder
     */
    inner class HomeCateGoryItemViewHolder(private val binding: ItemHomeCategoryBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
//                this.cate = item as ResponseHomeCategory
                this.position = pos
//                this.vm = viewModel
            }
        }
    }
}