package com.lakue.oburie.extension

import android.webkit.WebView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

/**
 * ViewPager Adapter
 */
@BindingAdapter("setWebUrl")
fun WebView.setWebUrl(
    url: String
){
    loadUrl(url)
}
