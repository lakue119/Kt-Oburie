package com.lakue.oburie.ui.joboffer.mine

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityMyJobOfferBinding
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.ui.jobhunter.list.JobHunterAdapter
import com.lakue.oburie.ui.jobhunter.list.JobhunterActivity

class MyJobOfferActivity : BaseActivity<ActivityMyJobOfferBinding, MyJobOfferViewModel>(R.layout.activity_my_job_offer) {

    lateinit var myJobOfferAdapter: MyJobOfferAdapter

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
        var sampleList = testCategoryResultProfile

        myJobOfferAdapter.addItem(sampleList)
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}