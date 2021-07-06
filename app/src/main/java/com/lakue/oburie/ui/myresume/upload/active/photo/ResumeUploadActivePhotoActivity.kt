package com.lakue.oburie.ui.myresume.upload.active.photo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.activity.result.contract.ActivityResultContracts
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadActrivePhotoBinding
import com.lakue.oburie.utils.camera.CameraUtil
import com.lakue.oburie.utils.camera.OnCameraPermissionListener
import com.lakue.oburie.utils.camera.OnShowCameraListener
import com.lakue.oburie.utils.camera.OnShowGalleryListener
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView

class ResumeUploadActivePhotoActivity : BaseActivity<ActivityResumeUploadActrivePhotoBinding, ResumeUploadActivePhotoViewModel>(R.layout.activity_resume_upload_actrive_photo) {

    lateinit var cameraUtil: CameraUtil

    private val photoLauncher =
        registerForActivityResult(ActivityResultContracts.TakePicture()) {
            if(it){
//                    val intent = Intent(this@ChatActivity, ActivityUploadPrescription::class.java)
//                    intent.putExtra("uri", photoUri.toString())
//                    startActivity(intent)
            }
        }

    private val albumLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {

            }

        }

    companion object {
        fun startResumeUploadActivePhotoActivity(
            context: Context
        ) {
            val intent = Intent(context, ResumeUploadActivePhotoActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    private fun cropImage(uri: Uri?){
        CropImage.activity(uri).setGuidelines(CropImageView.Guidelines.ON)
            .setCropShape(CropImageView.CropShape.RECTANGLE)
            .setAspectRatio(360,240)
            //사각형 모양으로 자른다
            .start(this)
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@ResumeUploadActivePhotoActivity
        }
        cameraUtil = CameraUtil(this)

        cameraUtil.apply{
            setOnShowCameraListener(object : OnShowCameraListener {
                override fun onShowCamera(uri: Uri) {
                    photoLauncher.launch(uri)
                }
            })

            setOnShowGalleryListener(object : OnShowGalleryListener {
                override fun onShowGallery(intent: Intent) {
                    albumLauncher.launch(intent)
                }
            })

            setOnCameraPermissionListener(object :OnCameraPermissionListener{
                override fun onCameraPermission() {
                    cropImage(Uri.parse(""))
                }

            })
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    fun showCamera(){
        cameraUtil.onCameraPermission()
    }

    fun showGallery(){
        cameraUtil.onShowCameraCropAlbum()
    }
}