package com.lakue.oburie.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun onBind(vm: BaseViewModel, pos: Int)
}