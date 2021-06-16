package com.lakue.oburie.view.toggle.togglehelper

import android.content.res.ColorStateList
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.lakue.oburie.R

class ToggleButtonHelper(val view: TextView, attrs: AttributeSet?): ITextToggleButton{
    val Tag = ToggleButtonHelper::class.java.name

    var mText = ""
    var mTextColor = 0
    var mToggleText = ""
    var mToggleTextColor = 0
    var mChecked = false
    var mBackground = 0
    var mToggleBackground = 0
    var mBackgroundTint = 0
    var mToggleBackgroundTint = 0



    init {
        val typedArray = view.context.obtainStyledAttributes(
            attrs,
            R.styleable.TextToggleButton
        )
        mText = typedArray.getString(R.styleable.TextToggleButton_toggle_text)!!
        mTextColor = typedArray.getColor(
            R.styleable.TextToggleButton_toggle_text_color, view.context.resources.getColor(
                R.color.black
            )
        )
        mToggleText = typedArray.getString(R.styleable.TextToggleButton_toggle_select_text)!!
        mToggleTextColor = typedArray.getColor(
            R.styleable.TextToggleButton_toggle_select_text_color, view.context.resources.getColor(
                R.color.black
            )
        )
        mChecked = typedArray.getBoolean(R.styleable.TextToggleButton_toggle_is_checked, false)
        mBackground = typedArray.getResourceId(
            R.styleable.TextToggleButton_toggle_background, view.context.resources.getColor(
                R.color.black
            )
        )
        mToggleBackground = typedArray.getResourceId(
            R.styleable.TextToggleButton_toggle_selectedBackground,
            view.context.resources.getColor(
                R.color.black
            )
        )
        mToggleBackgroundTint = typedArray.getColor(
            R.styleable.TextToggleButton_toggle_select_background_tint, view.context.resources.getColor(
                R.color.black
            )
        )
        mBackgroundTint = typedArray.getColor(
            R.styleable.TextToggleButton_toggle_background_tint, view.context.resources.getColor(
                R.color.black
            )
        )

        view.gravity = Gravity.CENTER

        typedArray.recycle()
        setEvent()
        setUI()
    }

    fun setEvent(){
        view.setOnClickListener {
            mChecked = !mChecked
            view.isSelected = mChecked

            setUI()
        }
    }

    fun setUI(){
        if(mChecked){
            view.text = mToggleText
            view.setBackgroundResource(mToggleBackground)
            view.setTextColor(mToggleTextColor)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                view.backgroundTintList = ColorStateList.valueOf(mToggleBackgroundTint)
            }
        } else {
            view.text = mText
            view.setBackgroundResource(mBackground)
            view.setTextColor(mTextColor)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                view.backgroundTintList = ColorStateList.valueOf(mBackgroundTint)
            }
        }
    }


    override fun setText(text: String) {
        mText = text
    }

    override fun getText(): String {
        return mText
    }

    override fun setTextColor(color: Int) {
        mTextColor = color
    }

    override fun getTextColor(): Int {
        return mTextColor
    }

    override fun setToggleText(text: String) {
        mToggleText = text
    }

    override fun getToggleText(): String {
        return mToggleText
    }

    override fun setToggleTextColor(color: Int) {
        mToggleTextColor = color
    }

    override fun getToggleTextColor(): Int {
        return mToggleTextColor
    }

    override fun getChecked(): Boolean {
        return mChecked
    }

    override fun setChecked(isChecked: Boolean) {
        mChecked = isChecked
    }

    override fun getBackgroundColor(): Int {
        return mBackground
    }

    override fun setBackgroundColor(background: Int) {
        mBackground = background
    }

    override fun getToggleBackground(): Int {
        return mToggleBackground
    }

    override fun setToggleBackground(background: Int) {
        mToggleBackground = background
    }

    override fun setBackgroundTint(color: Int) {
        mBackgroundTint = color
    }

    override fun getBackgroundTint(): Int {
        return mBackgroundTint
    }

    override fun setToggleBackgroundTint(color: Int) {
        mToggleBackgroundTint = color
    }

    override fun getToggleBackgroundTint(): Int {
        return mToggleBackgroundTint
    }

}