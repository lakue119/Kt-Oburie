package com.lakue.oburie.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemSearchRecommendBinding

class SearchAdapter (private val viewModel: SearchViewModel) : BaseAdapter(){

    var dataCount = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemSearchRecommendBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_search_recommend,
                parent,
                false
        ).let {
            return SearchRecommendViewHolder(it)
        }
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        (holder as SearchRecommendViewHolder).onBind(viewModel, position)
    }

    inner class SearchRecommendViewHolder(private val binding: ItemSearchRecommendBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = item as SearchViewModel
                this.position = pos
            }
        }
    }


}