package com.lakue.oburie.ui.userprofile.info

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityUserInfoBinding
import com.lakue.oburie.databinding.ActivityUserInfoSettingBinding
import com.lakue.oburie.ui.userinfo.UserInfoSettingActivity
import com.lakue.oburie.ui.userinfo.UserInfoSettingViewModel
import com.lakue.oburie.ui.userprofile.UserProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoActivity : BaseActivity<ActivityUserInfoBinding, UserInfoViewModel>(R.layout.activity_user_info) {

    lateinit var userInfoProfileAdapter: UserInfoProfileAdapter

    companion object {
        fun startUserInfoActivity(
            context: Context
        ) {
            val intent = Intent(context, UserInfoActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        userInfoProfileAdapter = UserInfoProfileAdapter(viewModel)
        binding.apply {
            vm = viewModel
            activity = this@UserInfoActivity
        }
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}