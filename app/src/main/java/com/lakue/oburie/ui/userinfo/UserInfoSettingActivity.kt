package com.lakue.oburie.ui.userinfo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityUserInfoSettingBinding
import com.lakue.oburie.databinding.ActivityUserProfileBinding
import com.lakue.oburie.ui.userprofile.UserProfileActivity
import com.lakue.oburie.ui.userprofile.UserProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoSettingActivity : BaseActivity<ActivityUserInfoSettingBinding, UserInfoSettingViewModel>(R.layout.activity_user_info_setting) {

    companion object {
        fun startUserInfoSettingActivity(
            context: Context
        ) {
            val intent = Intent(context, UserInfoSettingActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@UserInfoSettingActivity
        }
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}