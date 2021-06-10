package com.lakue.oburie.ui.joboffer.upload

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import com.applandeo.materialcalendarview.CalendarView
import com.applandeo.materialcalendarview.DatePicker
import com.applandeo.materialcalendarview.builders.DatePickerBuilder
import com.applandeo.materialcalendarview.listeners.OnSelectDateListener
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityJobOfferDetailBinding
import com.lakue.oburie.databinding.ActivityJobOfferUploadBinding
import com.lakue.oburie.ui.joboffer.detail.JobOfferDetailViewModel
import com.lakue.oburie.ui.joboffer.searchlist.JobOfferSearchActivity
import com.lakue.oburie.ui.picker.SelectPickerActivity
import com.lakue.oburie.utils.ActivityContract
import java.util.*

class JobOfferUploadActivity: BaseActivity<ActivityJobOfferUploadBinding, JobOfferUploadViewModel>(R.layout.activity_job_offer_upload){

    private val selectLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityContract()
    ) {
        it?.let {
            val type = it.getStringExtra("type")
            val option = it.getStringExtra("option")

            binding.apply {
                when (type) {
                    "hour" -> {
                        tvHour.text = option
                    }
                    "minute" -> {
                        tvMinute.text = option
                    }
                    "needTime" -> {
                        tvNeedTime.text = option
                    }

                }
            }
        }.run {

        }
    }

    companion object {
        fun startJobOfferUploadActivity(
            context: Context
        ) {
            val intent = Intent(context, JobOfferUploadActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply{
            vm = viewModel
            activity = this@JobOfferUploadActivity
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }


    fun showCalendar() {

        val builder = DatePickerBuilder(this, object : OnSelectDateListener {
            override fun onSelect(calendar: List<Calendar>) {
                viewModel.meetDate.postValue("${calendar[0][Calendar.YEAR]}-${calendar[0][Calendar.MONTH]+1}-${calendar[0][Calendar.DAY_OF_MONTH]}")
            }
        })
            .pickerType(CalendarView.ONE_DAY_PICKER)

        val datePicker: DatePicker = builder.build()
        datePicker.show()
    }

    fun showPicker(view: View){
        var intent = Intent(this@JobOfferUploadActivity, SelectPickerActivity::class.java)
        intent.putExtra("type", view.tag.toString())
        selectLauncher.launch(intent)
    }

}
