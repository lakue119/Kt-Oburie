package com.lakue.oburie.ui.myresume.upload.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadDetailBinding
import com.lakue.oburie.ui.myresume.upload.ResumeUploadActivity

class ResumeUploadDetailActivity: BaseActivity<ActivityResumeUploadDetailBinding, ResumeUploadDetailViewModel>(R.layout.activity_resume_upload_detail) {

    companion object {
        fun startResumeUploadDetailActivity(
            context: Context
        ) {
            val intent = Intent(context, ResumeUploadDetailActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {

    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

}