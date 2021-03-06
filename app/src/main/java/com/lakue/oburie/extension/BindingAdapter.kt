package com.lakue.oburie.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
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

/**
 * RecyclerView Adapter
 */
@BindingAdapter("setAdapter")
fun RecyclerView.setAdaper(
        adapter: RecyclerView.Adapter<*>
){
    this.apply {
        setHasFixedSize(true)
        this.adapter = adapter
    }
}