package com.lakue.oburie.ui.myresume.upload.active.video

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadActriveVideoBinding

class ResumeUploadActiveVideoActivity : BaseActivity<ActivityResumeUploadActriveVideoBinding, ResumeUploadActiveVideoViewModel>(R.layout.activity_resume_upload_actrive_video) {

    companion object {
        fun startResumeUploadActiveActivity(
            context: Context
        ) {
            val intent = Intent(context, ResumeUploadActiveVideoActivity::class.java)
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