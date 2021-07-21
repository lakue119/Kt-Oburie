package com.lakue.oburie.ui.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemCategoryResultLargeBinding
import com.lakue.oburie.databinding.ItemCategoryResultSmallBinding
import com.lakue.oburie.databinding.ItemOburieHistoryBinding

class OburieHistoryAdapter(val viewModel: OburieHistoryViewModel) : BaseAdapter() {

    val myItems = ArrayList<Any>()

    fun addItem(item: Any){
        myItems.add(item)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemOburieHistoryBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_oburie_history,
                parent,
                false
        ).let {
            return HistoryViewHolder(it)
        }
    }

    override fun getItemCount() = myItems.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(myItems[position], position)
    }

    /**
     * ViewHolder
     */
    inner class HistoryViewHolder(private val binding: ItemOburieHistoryBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                vm = viewModel
            }
        }
    }

}