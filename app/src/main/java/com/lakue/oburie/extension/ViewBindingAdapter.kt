package com.lakue.oburie.extension

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * View Selected
 */
@BindingAdapter("isSelected")
fun View.setSelected(selectState: Boolean){
    this.isSelected = selectState
}