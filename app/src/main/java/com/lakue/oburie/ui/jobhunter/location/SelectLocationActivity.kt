package com.lakue.oburie.ui.jobhunter.location

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivitySelectLocationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectLocationActivity : BaseActivity<ActivitySelectLocationBinding, SelectLocationViewModel>(R.layout.activity_select_location) {


    lateinit var locationAdapter: SelectLocationAdapter

    companion object {
        fun startSelectLocationActivity(
            context: Context
        ) {
            val intent = Intent(context, SelectLocationActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@SelectLocationActivity
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
//        viewModel.apply{
//            locationData.observe(this@SelectLocationActivity, Observer {
//                locationAdapter.setCount(it.size)
//            })
//        }
    }

}