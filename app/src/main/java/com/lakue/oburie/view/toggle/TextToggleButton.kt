package com.lakue.oburie.view.toggle

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import com.lakue.oburie.R
import com.lakue.oburie.view.toggle.togglehelper.ITextToggleButton
import com.lakue.oburie.view.toggle.togglehelper.ToggleButtonHelper

@SuppressLint("AppCompatCustomView")
class TextToggleButton@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): TextView(context, attrs, defStyleAttr), ITextToggleButton {

    val Tag = TextToggleButton::class.java.name
    val helper = ToggleButtonHelper(this, attrs)

    override fun setText(text: String) {
        helper.setText(text)
    }

    override fun getText(): String {
        return helper.getText()
    }

    override fun getTextColor(): Int {
        return helper.getTextColor()
    }

    override fun setToggleText(text: String) {
        helper.setToggleText(text)
    }

    override fun getToggleText(): String {
        return helper.getToggleText()
    }

    override fun setToggleTextColor(color: Int) {
        helper.setToggleTextColor(color)
    }

    override fun getToggleTextColor(): Int {
        return helper.getToggleTextColor()
    }

    override fun getChecked(): Boolean {
        return helper.getChecked()
    }

    override fun setChecked(isChecked: Boolean) {
        helper.setChecked(isChecked)
    }

    override fun getBackgroundColor(): Int {
        return helper.getBackgroundColor()
    }

    override fun getToggleBackground(): Int {
        return helper.getToggleBackground()
    }

    override fun setToggleBackground(background: Int) {
        helper.setToggleBackground(background)
    }

    override fun setBackgroundTint(color: Int) {
        helper.setBackgroundTint(color)
    }

    override fun getBackgroundTint(): Int {
        return helper.getBackgroundTint()
    }

    override fun setToggleBackgroundTint(color: Int) {
        helper.setToggleBackgroundTint(color)
    }

    override fun getToggleBackgroundTint(): Int {
        return helper.getToggleBackgroundTint()
    }

}