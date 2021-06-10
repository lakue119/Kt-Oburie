package com.lakue.oburie.ui.picker

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bigkoo.pickerview.adapter.ArrayWheelAdapter
import com.contrarywind.view.WheelView
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivitySearchBinding
import com.lakue.oburie.databinding.ActivitySelectPickerBinding
import com.lakue.oburie.ui.chat.appointment.AppointmentActivity
import com.lakue.oburie.ui.search.SearchViewModel
import java.util.ArrayList

class SelectPickerActivity : BaseActivity<ActivitySelectPickerBinding, SelectPickerViewModel>(R.layout.activity_select_picker) {

    private val type by lazy { intent.getStringExtra("type")}
    val mOptionsItems: MutableList<String> = ArrayList()

    override fun init() {
        binding.apply{
            activity = this@SelectPickerActivity

            wheelView.apply {
                setTextSize(20f)
                setLineSpacingMultiplier(2.5f)
                setDividerColor(0xfff8f8)
                setCyclic(false)
                setDividerType(WheelView.DividerType.WRAP)
                setTextColorCenter(resources.getColor(R.color.point_1000))
                setTextColorOut(resources.getColor(R.color.gray_999))
            }

            when(type){
                "hour" -> {
                    tvOption.text = "시간을 선택해주세요."
                    mOptionsItems.addAll(hour)
                }
                "minute" -> {
                    tvOption.text = "분을 선택해주세요."
                    mOptionsItems.addAll(minute)

                }
                "needTime" -> {
                    tvOption.text = "필요한 시간을 선택해주세요."
                    mOptionsItems.addAll(needTime)
                }
            }

            wheelView.adapter = ArrayWheelAdapter(mOptionsItems)
        }
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

    fun onFinish(){
        finish()
    }

    fun onSelect(){
        val resultIntent = Intent()
        resultIntent.putExtra("type", type)
        resultIntent.putExtra("option", mOptionsItems[binding.wheelView.currentItem])
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }

}