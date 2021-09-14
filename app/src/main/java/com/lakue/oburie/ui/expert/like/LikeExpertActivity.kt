package com.lakue.oburie.ui.expert.like

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import com.lakue.oburie.databinding.ActivityLikeExpertBinding
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.ui.expert.ExpertViewModel
import com.lakue.oburie.ui.jobhunter.list.JobHunterAdapter
import com.lakue.oburie.ui.jobhunter.list.JobhunterActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LikeExpertActivity : BaseActivity<ActivityLikeExpertBinding, ExpertViewModel>(R.layout.activity_like_expert) {

    lateinit var profileAdapter: LikeExpertAdapter

    companion object {
        fun startLikeExpertActivity(
            context: Context
        ) {
            val intent = Intent(context, LikeExpertActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }


    override fun init() {
        profileAdapter = LikeExpertAdapter(viewModel)
        binding.apply {
            vm = viewModel
            activity = this@LikeExpertActivity
        }
        setData()
    }

    fun setData(){
        var sampleList = testCategoryResultProfile

        profileAdapter.addItem(sampleList)
    }

}