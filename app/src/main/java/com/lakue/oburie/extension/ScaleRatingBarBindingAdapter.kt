package com.lakue.oburie.extension

import androidx.databinding.BindingAdapter
import com.willy.ratingbar.ScaleRatingBar

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
