package com.lakue.oburie.ui.myresume.upload.normal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadNormalBinding
import com.lakue.oburie.ui.myresume.upload.ResumeUploadActivity

class ResumeUploadNormalActivity : BaseActivity<ActivityResumeUploadNormalBinding, ResumeUploadNormalViewModel>(R.layout.activity_resume_upload_normal) {

    companion object {
        fun startResumeUploadNormalActivity(
            context: Context
        ) {
            val intent = Intent(context, ResumeUploadNormalActivity::class.java)
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

