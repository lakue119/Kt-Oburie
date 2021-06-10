package com.lakue.oburie.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.lakue.oburie.listener.OnEmptyBackgroundClickListener

class ObRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): RecyclerView(context, attrs, defStyleAttr) {

    init {
        this.clipToPadding = false
        this.overScrollMode = View.OVER_SCROLL_NEVER
    }

}