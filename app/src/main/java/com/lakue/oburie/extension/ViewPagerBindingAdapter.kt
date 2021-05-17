package com.lakue.oburie.extension

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


/**
 * ViewPager Adapter
 */
@BindingAdapter("setViewPagerAdapter")
fun ViewPager2.setViewPagerAdapter(
    adapter: RecyclerView.Adapter<*>
){
    this.apply {
        this.adapter = adapter
    }
}
