package com.lakue.oburie.view.toggle.togglehelper

import androidx.annotation.ColorInt

interface ITextToggleButton {
    fun setText(text: String)
    fun getText(): String
    fun setTextColor(@ColorInt color: Int)
    fun getTextColor(): Int
    fun setToggleText(text: String)
    fun getToggleText(): String
    fun setToggleTextColor(@ColorInt color: Int)
    fun getToggleTextColor(): Int
    fun getChecked(): Boolean
    fun setChecked(isChecked: Boolean)
    fun getBackgroundColor(): Int
    fun setBackgroundColor(background: Int)
    fun getToggleBackground(): Int
    fun setToggleBackground(background: Int)
    fun setBackgroundTint(@ColorInt color: Int)
    fun getBackgroundTint(): Int
    fun setToggleBackgroundTint(@ColorInt color: Int)
    fun getToggleBackgroundTint(): Int
}