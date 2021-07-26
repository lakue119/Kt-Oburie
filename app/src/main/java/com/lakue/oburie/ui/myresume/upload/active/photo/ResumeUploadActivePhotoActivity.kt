package com.lakue.oburie.ui.myresume.upload.active.photo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.net.Uri
import android.provider.MediaStore
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityResumeUploadActrivePhotoBinding
import com.lakue.oburie.utils.BaseUtils.context
import com.lakue.oburie.utils.LogUtil
import com.lakue.oburie.utils.camera.CameraUtil
import com.lakue.oburie.utils.camera.OnCameraPermissionListener
import com.lakue.oburie.utils.camera.OnShowCameraListener
import com.lakue.oburie.utils.camera.OnShowGalleryListener
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import dagger.hilt.android.AndroidEntryPoint
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException


@AndroidEntryPoint
class ResumeUploadActivePhotoActivity : BaseActivity<ActivityResumeUploadActrivePhotoBinding, ResumeUploadActivePhotoViewModel>(R.layout.activity_resume_upload_actrive_photo) {

    lateinit var cameraUtil: CameraUtil
    val photoAdapter = ResumeUploadActivePhotoAdapter()
    val videoAdapter = ResumeUploadActiveVideoAdapter()
    var photoUri: Uri? = null

    private val photoLauncher =
        registerForActivityResult(ActivityResultContracts.TakePicture()) {
            if(it){
                rotateBitmap(photoUri!!).let {
                    photoAdapter.addItem(it)
                }
            }
        }

    private val albumLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                rotateBitmap(result.data?.data!!).let {
                    photoAdapter.addItem(it)
                }
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

    fun getRealPathFromURI(contentUri: Uri): String {
        var path = ""

        try{
            val proj = arrayOf(MediaStore.Images.Media.DATA)

            val cursor: Cursor = context.contentResolver.query(contentUri, proj, null, null, null)!!
            cursor.moveToNext()
            path = cursor.getString(cursor.getColumnIndex(MediaStore.MediaColumns.DATA))
            val uri = Uri.fromFile(File(path))

            cursor.close()
        } catch (e: RuntimeException){
            val uriString = contentUri.toString()
            val replaceUri = uriString.replace("content://com.lakue.oburie.free/external/","/storage/emulated/0/")
            LogUtil.i("QWKRJQKWLRJ",replaceUri)
            return replaceUri
        }

        return path
    }

    private fun rotateBitmap(uri: Uri): Bitmap{
        val imageFilePath = getRealPathFromURI(uri)

        val bitmap = BitmapFactory.decodeFile(imageFilePath)
        var exif: ExifInterface? = null
        try {
            exif = ExifInterface(imageFilePath)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        val exifOrientation: Int
        val exifDegree: Int
        if (exif != null) {
            exifOrientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL)
            exifDegree = exifOrientationToDegrees(exifOrientation)
        } else {
            exifDegree = 0
        }
        val rotatebitmap = rotate(bitmap, exifDegree.toFloat())
        val stream = ByteArrayOutputStream()
        rotatebitmap!!.compress(Bitmap.CompressFormat.JPEG, 100, stream)
        return rotatebitmap
    }

    //이미지 회전 각도 구하기
    open fun exifOrientationToDegrees(exifOrientation: Int): Int {
        return when (exifOrientation) {
            ExifInterface.ORIENTATION_ROTATE_90 -> {
                90
            }
            ExifInterface.ORIENTATION_ROTATE_180 -> {
                180
            }
            ExifInterface.ORIENTATION_ROTATE_270 -> {
                270
            }
            else -> 0
        }
    }

    //이미지 회전
    private fun rotate(bitmap: Bitmap, degree: Float): Bitmap? {
        val matrix = Matrix()
        matrix.postRotate(degree)
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)
    }

    private fun cropImage(uri: Uri?){
        CropImage.activity(uri).setGuidelines(CropImageView.Guidelines.ON)
            .setCropShape(CropImageView.CropShape.RECTANGLE)
            .setAspectRatio(360, 240)
            //사각형 모양으로 자른다
            .start(this)
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@ResumeUploadActivePhotoActivity
            rvPhotos.adapter = photoAdapter
            rvVideos.adapter = videoAdapter
        }
        cameraUtil = CameraUtil(this)

        cameraUtil.apply{
            setOnShowCameraListener(object : OnShowCameraListener {
                override fun onShowCamera(uri: Uri) {
                    photoUri = uri
                    photoLauncher.launch(photoUri)
                }
            })

            setOnShowGalleryListener(object : OnShowGalleryListener {
                override fun onShowGallery(intent: Intent) {
                    albumLauncher.launch(intent)
                }
            })

            setOnCameraPermissionListener(object : OnCameraPermissionListener {
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
        cameraUtil.onShowCamera()
    }

    fun showGallery(){
        cameraUtil.onShowCameraCropAlbum()
    }

    fun addUrl(){
        videoAdapter.addItem(binding.etUrl.text.toString())
        binding.etUrl.text = "".toEditable()
    }
}