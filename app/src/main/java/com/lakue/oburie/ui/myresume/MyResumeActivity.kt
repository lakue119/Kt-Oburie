package com.lakue.oburie.ui.myresume

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityMyResumeBinding
import com.lakue.oburie.ui.myresume.upload.ResumeUploadActivity.Companion.startResumeUploadActivity
import com.lakue.oburie.ui.review.list.ReviewListActivity

class MyResumeActivity : BaseActivity<ActivityMyResumeBinding, MyResumeViewModel>(R.layout.activity_my_resume) {

    companion object {
        fun startMyResumeActivity(
                context: Context
        ) {
            val intent = Intent(context, MyResumeActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@MyResumeActivity
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    fun showResumeUpload(){
        startResumeUploadActivity(this)
    }

}