package com.lakue.oburie.extension

import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * 이미지뷰 Glide
 */


@BindingAdapter("image_url")
fun ImageView.setImage(
    url: String
){
    Glide.with(context).load(url).into(this)
}

@BindingAdapter("image_icon")
fun ImageView.setIconImage(
    url: Int
){
    Glide.with(context).load(url).into(this)
}

@BindingAdapter("hot_visible")
fun ImageView.setHoyVisible(
    cate: String
){
    this.isVisible = cate == "급구"
}

@BindingAdapter("likeSelected")
fun ImageView.setSelected(
        isSelected: Boolean
){
    this.isSelected = isSelected
}