package com.lakue.oburie.ui.categoryresult.location

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemSelectLocationBinding

class SelectLocationAdapter(private val viewModel: SelectLocationViewModel) : BaseAdapter() {

    var dataCount = 0

    fun setCount(count: Int) {
        dataCount = count
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataBindingUtil.inflate<ItemSelectLocationBinding>(
        LayoutInflater.from(parent.context),
        R.layout.item_select_location,
        parent,
        false
    ).let {
        SelectLocationViewHolder(it)
    }

    override fun getItemCount() = dataCount

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(viewModel, position)
    }

    /**
     * ViewHolder
     */
    inner class SelectLocationViewHolder(private val binding: ItemSelectLocationBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                this.vm = item as SelectLocationViewModel
                this.position = pos

                tvSelect.isSelected = true
            }
        }
    }

}