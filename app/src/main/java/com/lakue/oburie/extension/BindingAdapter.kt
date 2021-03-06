package com.lakue.oburie.extension

import android.widget.BaseAdapter
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

//@BindingAdapter("listData")
//fun bindRecyclerView(recyclerView: RecyclerView, data: List<Any>?) {
//    val adapter = recyclerView.adapter as BaseAdapter
//    adapter.submitList(data)
//}

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

@BindingAdapter("setAdapter")
fun RecyclerView.setAdaper(
        adapter: RecyclerView.Adapter<*>
){
    this.apply {
        setHasFixedSize(true)
        this.adapter = adapter
    }
}