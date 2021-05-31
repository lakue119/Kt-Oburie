package com.lakue.oburie.ui.userprofile

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityUserProfileBinding
import com.lakue.oburie.ui.review.list.ReviewListActivity.Companion.startReviewListActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class UserProfileActivity : BaseActivity<ActivityUserProfileBinding, UserProfileViewModel>(R.layout.activity_user_profile) {

    companion object {
        fun startUserProfileActivity(
                context: Context
        ) {
            val intent = Intent(context, UserProfileActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@UserProfileActivity
        }

        viewModel.apply {
            youtubeDetailEvent eventObserve {showYoutube(it)}
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    fun showReview(){
        startReviewListActivity(this@UserProfileActivity)
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
}