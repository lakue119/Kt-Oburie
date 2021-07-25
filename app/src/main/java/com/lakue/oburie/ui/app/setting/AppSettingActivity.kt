package com.lakue.oburie.ui.app.setting

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityAppSettingBinding
import com.lakue.oburie.databinding.ActivityUserInfoSettingBinding
import com.lakue.oburie.ui.userinfo.UserInfoSettingActivity
import com.lakue.oburie.ui.userinfo.UserInfoSettingViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppSettingActivity : BaseActivity<ActivityAppSettingBinding, AppSettingViewModel>(R.layout.activity_app_setting) {

    companion object {
        fun startAppSettingActivity(
            context: Context
        ) {
            val intent = Intent(context, AppSettingActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@AppSettingActivity
        }
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }
}