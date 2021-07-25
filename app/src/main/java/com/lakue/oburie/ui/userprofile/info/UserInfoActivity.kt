package com.lakue.oburie.ui.userprofile.info

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityUserInfoBinding
import com.lakue.oburie.databinding.ActivityUserInfoSettingBinding
import com.lakue.oburie.test.testUserProfileDetail
import com.lakue.oburie.ui.userinfo.UserInfoSettingActivity
import com.lakue.oburie.ui.userinfo.UserInfoSettingViewModel
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import com.lakue.oburie.ui.userprofile.UserProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoActivity : BaseActivity<ActivityUserInfoBinding, UserInfoViewModel>(R.layout.activity_user_info) {

    lateinit var userInfoProfileAdapter: UserInfoProfileAdapter
    val testData = testUserProfileDetail

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
            info =  testData.userInfo
        }
        viewModel.apply{
            profileDetailEvent eventObserve {showProfileDetail()}
        }
        userInfoProfileAdapter.addItem(testData.profile)
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

    fun showYoutube(youeubeUrl: String){
        startActivity( Intent(Intent.ACTION_VIEW)
            .setData(Uri.parse(youeubeUrl)) // edit this url
            .setPackage("com.google.android.youtube"));	// do not edit
    }

    fun showFaceBook(facebookPageID: String){
        val facebookUrl = "https://www.facebook.com/$facebookPageID" //링크
        val facebookUrlScheme = "fb://page/$facebookPageID"
        try {
            val versionCode =
                packageManager.getPackageInfo("com.facebook.katana", 0).versionCode
            if (versionCode >= 3002850) {
                val uri =
                    Uri.parse("fb://facewebmodal/f?href=$facebookUrl")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
            } else {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrlScheme)))
            }
        } catch (e: PackageManager.NameNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)))
        }
    }

    fun showInstagram(InstagramPageID: String){

        val uri =
            Uri.parse("http://instagram.com/_u/$InstagramPageID")
        val Instagram_Intent = Intent(Intent.ACTION_VIEW, uri)

        Instagram_Intent.setPackage("com.instagram.android")

        try {
            startActivity(Instagram_Intent)
        } catch (e: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/$InstagramPageID")
                )
            )
        }
    }

    private fun showProfileDetail(){
        startUserProfileActivity(this@UserInfoActivity)
    }
}