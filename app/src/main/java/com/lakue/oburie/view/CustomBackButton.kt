package com.lakue.oburie.view

import android.app.Activity
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import com.lakue.oburie.R
import com.lakue.oburie.utils.UnitConverter


class CustomBackButton @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
): AppCompatImageView(context, attrs, defStyleAttr) {

    init {
        setEvent()
        setButtonImage()
    }

    fun setEvent(){
        this.setOnClickListener {
            (context as Activity).finish()
        }
    }

    fun setButtonImage(){
        this.setImageResource(R.drawable.ic_round_chevron_left_24)
        this.setColorFilter(getColor(context, R.color.color_dark_ffffff_000000))
        this.setPadding(0,UnitConverter.dpToPx(13),UnitConverter.dpToPx(13), UnitConverter.dpToPx(13))
    }

    fun getColor(context: Context, id: Int): Int {
        val version = Build.VERSION.SDK_INT
        return if (version >= 23) {
            ContextCompat.getColor(context, id)
        } else {
            context.resources.getColor(id)
        }
    }
}