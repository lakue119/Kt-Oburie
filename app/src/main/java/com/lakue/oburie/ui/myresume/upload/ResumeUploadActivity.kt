package com.lakue.oburie.ui.myresume.upload

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadBinding
import com.lakue.oburie.ui.myresume.MyResumeActivity

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

    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}