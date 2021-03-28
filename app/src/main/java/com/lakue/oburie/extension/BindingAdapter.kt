package com.lakue.oburie.extension

import android.view.MotionEvent
import android.view.View
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.lakue.oburie.utils.ConvertNumberFormat
import com.willy.ratingbar.ScaleRatingBar
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

@BindingAdapter("hot_visible")
fun ImageView.setHoyVisible(
        cate: String
){
    this.isVisible = cate == "급구"
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

/**
 * Text Format
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

@BindingAdapter("minAmount","maxAmount")
fun TextView.setAmount(
        minAmount: Int,
        maxAmount: Int
){
   if(minAmount == maxAmount){
       this.text = "${ConvertNumberFormat.numberFormat(minAmount,"원")}"
   } else {
       this.text = "${ConvertNumberFormat.numberFormat(minAmount,"원")} ~ ${ConvertNumberFormat.numberFormat(maxAmount,"원")}"
   }
}

/**
 * View Selected
 */
@BindingAdapter("isSelected")
fun View.setSelected(selectState: Boolean){
    this.isSelected = selectState
}

/**
 * RatingBar Touch Event Disable
 */
@BindingAdapter("touchDisable")
fun ScaleRatingBar.setTouchDisable(touch: Boolean){
    this.setOnTouchListener { p0, p1 -> touch }
}

@BindingAdapter("reviewScore")
fun ScaleRatingBar.setReviewScore(float: Float){
    this.rating = float
}

/**
 * ViewCount
 */
@BindingAdapter("viewCount")
fun TextView.setViewCount(count: Int){
    this.text = "조회수 : ${ConvertNumberFormat.numberFormat(count,"")}"
}

@BindingAdapter("userReviewCount")
fun TextView.setUserReviewCount(count: Int){
    this.text = "리뷰(${ConvertNumberFormat.numberFormat(count,"명")})"
}

@BindingAdapter("jobOfferViewCount", "jobOfferApplyCount")
fun TextView.setJobOfferView(viewCount: Int, applyCount: Int){
    this.text = "View ${ConvertNumberFormat.numberFormat(viewCount,"")}   지원 ${ConvertNumberFormat.numberFormat(applyCount,"")}"
}



