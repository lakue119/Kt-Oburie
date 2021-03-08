package com.lakue.oburie.extension

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lakue.oburie.utils.ConvertNumberFormat
import java.lang.StringBuilder

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

/**
 * Review Count Format
 */
@BindingAdapter("revierCount")
fun TextView.setReviewCount(
        count: Int
){
    var sCount = count.toString()
    var countLength = sCount.length-1
    var reviewCount = StringBuilder(sCount.substring(0,1))
    for(i in 0 until countLength){
        reviewCount.append("0")
    }

    this.text = "(${ConvertNumberFormat.numberFormat(reviewCount.toString().toInt(),"+")})"
}