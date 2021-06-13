package com.lakue.oburie.view.toggle

interface ITextToggleButton {
    fun setText(text: String)
    fun getText(): String
    fun setTextColor(color: Int)
    fun getTextColor(): Int
    fun toggleText(text: String)
    fun getToggleText(): String
    fun getChecked(): Boolean
    fun setChecked(isChecked: Boolean)
    fun getBackground(): Int
    fun setBackground(background: Int)
    fun getToggleBackground(): Int
    fun setToggleBackground(background: Int)
}