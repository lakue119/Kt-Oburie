package com.lakue.oburie.ui.myresume.upload

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadBinding
import com.lakue.oburie.ui.myresume.upload.active.photo.ResumeUploadActivePhotoActivity.Companion.startResumeUploadActivePhotoActivity
import com.lakue.oburie.ui.myresume.upload.active.video.ResumeUploadActiveVideoActivity.Companion.startResumeUploadActiveActivity
import com.lakue.oburie.ui.myresume.upload.detail.ResumeUploadDetailActivity.Companion.startResumeUploadDetailActivity
import com.lakue.oburie.ui.myresume.upload.normal.ResumeUploadNormalActivity.Companion.startResumeUploadNormalActivity

class ResumeUploadActivity : BaseActivity<ActivityResumeUploadBinding, ResumeUploadViewModel>(R.layout.activity_resume_upload) {

    companion object {
        fun startResumeUploadActivity(
            context: Context
        ) {
            val intent = Intent(context, ResumeUploadActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@ResumeUploadActivity
        }
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

    fun showUploadNormal(){
        startResumeUploadNormalActivity(this@ResumeUploadActivity)
    }

    fun showUploadDetail(){
        startResumeUploadDetailActivity(this@ResumeUploadActivity)
    }

    fun showUploadActive(){
        startResumeUploadActivePhotoActivity(this@ResumeUploadActivity)
    }

}