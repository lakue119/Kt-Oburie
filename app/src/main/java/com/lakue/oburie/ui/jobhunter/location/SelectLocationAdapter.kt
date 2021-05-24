package com.lakue.oburie.ui.jobhunter.location

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemSelectLocationBinding

class SelectLocationAdapter(private val viewModel: SelectLocationViewModel) : BaseAdapter() {

    private var dataCount = 0

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
//        viewModel.onSelectLocation(2)
        holder.onBind(viewModel, position)
    }

    override fun onViewAttachedToWindow(holder: BaseViewHolder) {
        super.onViewAttachedToWindow(holder)
        (holder as SelectLocationViewHolder).onAttach()
    }

    override fun onViewDetachedFromWindow(holder: BaseViewHolder) {
        super.onViewDetachedFromWindow(holder)
        (holder as SelectLocationViewHolder).onDetach()
    }

    /**
     * ViewHolder
     */
    inner class SelectLocationViewHolder(private val binding: ItemSelectLocationBinding) : BaseViewHolder(binding.root), LifecycleOwner {

        private val lifecycleRegistry by lazy { LifecycleRegistry(this) }

        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                lifecycleOwner = this@SelectLocationViewHolder
                this.vm = viewModel
                this.position = pos
            }
        }

        fun onAttach() {
            lifecycleRegistry.markState(Lifecycle.State.RESUMED)
        }

        fun onDetach() {
            lifecycleRegistry.markState(Lifecycle.State.CREATED)
        }

        override fun getLifecycle(): Lifecycle = lifecycleRegistry
    }



}