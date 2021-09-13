package com.lakue.oburie.ui.chat.appointment

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import com.applandeo.materialcalendarview.CalendarView
import com.applandeo.materialcalendarview.DatePicker
import com.applandeo.materialcalendarview.builders.DatePickerBuilder
import com.applandeo.materialcalendarview.listeners.OnSelectDateListener
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityAppointmentBinding
import com.lakue.oburie.ui.location.search.LocationSearchActivity
import com.lakue.oburie.ui.picker.SelectPickerActivity
import com.lakue.oburie.utils.ActivityContract
import com.lakue.oburie.utils.LogUtil
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import java.util.logging.Logger


@AndroidEntryPoint
class AppointmentActivity :
    BaseActivity<ActivityAppointmentBinding, AppointmentViewModel>(R.layout.activity_appointment) {

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

    private val addressLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityContract()
    ) {
        it?.let {
            val addressNum = it.getStringExtra("address_num")
            val address = it.getStringExtra("address")
            viewModel.setAddress(addressNum!!, address!!)
        }.run {

        }
    }

    companion object {
        fun startAppointmentActivity(
            context: Context
        ) {
            val intent = Intent(context, AppointmentActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@AppointmentActivity
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

    fun showPicker(view:View){
        var intent = Intent(this@AppointmentActivity, SelectPickerActivity::class.java)
        intent.putExtra("type", view.tag.toString())
        selectLauncher.launch(intent)
    }

    fun showLocationSearch(){
        val intent = Intent(this@AppointmentActivity, LocationSearchActivity::class.java)
        addressLauncher.launch(intent)
    }

}