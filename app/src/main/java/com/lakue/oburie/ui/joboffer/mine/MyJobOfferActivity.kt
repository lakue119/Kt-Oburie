package com.lakue.oburie.ui.joboffer.mine

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityMyJobOfferBinding
import com.lakue.oburie.model.history.History
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.test.testHistory
import com.lakue.oburie.test.testMyJobOfferSample
import com.lakue.oburie.ui.jobhunter.list.JobHunterAdapter
import com.lakue.oburie.ui.jobhunter.list.JobhunterActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyJobOfferActivity : BaseActivity<ActivityMyJobOfferBinding, MyJobOfferViewModel>(R.layout.activity_my_job_offer) {

    lateinit var myJobOfferAdapter: MyJobOfferAdapter

    val testMyJobOffer = testMyJobOfferSample

    companion object {
        fun startMyJobOfferActivity(
            context: Context
        ) {
            val intent = Intent(context, MyJobOfferActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        myJobOfferAdapter = MyJobOfferAdapter(viewModel)
        binding.apply {
            vm = viewModel
            activity = this@MyJobOfferActivity
        }
        setData()
    }

    fun setData(){
        myJobOfferAdapter.addItem(arrayListOf(History()))
        myJobOfferAdapter.addItem(testMyJobOffer)
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}