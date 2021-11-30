package com.lakue.oburie.extension

import android.graphics.Bitmap
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * 이미지뷰 Glide
 */


@BindingAdapter("image_url")
fun ImageView.setImage(
    url: String?
){
    if(url == null){
        return
    }
    Glide.with(context).load(url).into(this)
}

@BindingAdapter("image_icon")
fun ImageView.setIconImage(
    url: Int
){
    Glide.with(context).load(url).into(this)
}

@BindingAdapter("image_bitmap")
fun ImageView.setImage(
        bitmap: Bitmap
){
    Glide.with(context).load(bitmap).into(this)
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

@BindingAdapter("strEmptyCheck")
fun ImageView.setEmptyCheck(
        str: String
){
    this.isVisible = str.isNotEmpty()
}