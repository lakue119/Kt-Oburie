package com.lakue.oburie.view.toggle

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.Switch
import com.lakue.oburie.R

class TextToggleButton@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): Switch(context, attrs, defStyleAttr), ITextToggleButton {

    val Tag = TextToggleButton::class.java.name

    init {

    }

    fun initView(attrs: AttributeSet?){
        val typeArray = context.obtainStyledAttributes(
            attrs, R.styleable.RecyclerView
        )
        setTypeArray(typeArray)
    }
    private fun setTypeArray(typedArray: TypedArray) {
        val text = typedArray.getString(R.styleable.TextToggleButton_toggle_text)
    }


    override fun setText(text: String) {
    }

    override fun getText(): String {
        return ""
    }

    override fun getTextColor(): Int {
        return 0
    }

    override fun toggleText(text: String) {
    }

    override fun getToggleText(): String {
        return ""
    }

    override fun getChecked(): Boolean {
        return false
    }

    override fun getBackground(): Int {
        return 0
    }

    override fun setBackground(background: Int) {
    }

    override fun getToggleBackground(): Int {
        return 0
    }

    override fun setToggleBackground(background: Int) {
    }

}