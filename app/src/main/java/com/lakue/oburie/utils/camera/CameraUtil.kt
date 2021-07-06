package com.lakue.oburie.utils.camera

import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.content.FileProvider
import com.hjq.permissions.OnPermissionCallback
import com.hjq.permissions.Permission
import com.hjq.permissions.XXPermissions
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class CameraUtil(val context: Context) {

    var cw = ContextWrapper(context)

    val HOME_DIRECTORY = Environment.getExternalStorageDirectory().path
    val NEW_HOME_DIRECTORY = cw.getExternalFilesDir(null)!!.path

    private var tempFile: File? = null
//    lateinit var photoUri: Uri

    private var onShowCameraListener: OnShowCameraListener? = null
    private var onShowGalleryListener: OnShowGalleryListener? = null
    private var onCameraPermissionListener: OnCameraPermissionListener? = null

    fun setOnShowCameraListener(onShowCameraListener: OnShowCameraListener){
        this.onShowCameraListener = onShowCameraListener
    }

    fun setOnShowGalleryListener(onShowGalleryListener: OnShowGalleryListener){
        this.onShowGalleryListener = onShowGalleryListener
    }

    fun setOnCameraPermissionListener(onCameraPermissionListener: OnCameraPermissionListener){
        this.onCameraPermissionListener = onCameraPermissionListener
    }

    fun onCameraPermission(){
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
            XXPermissions.with(context)
                .permission(Permission.READ_EXTERNAL_STORAGE)
                .permission(Permission.CAMERA)
                .request(object : OnPermissionCallback {
                    override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                        onCameraPermissionListener?.onCameraPermission()
                    }

                    override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                        super.onDenied(permissions, never)

                    }
                })
        } else {
            XXPermissions.with(context)
                .permission(Permission.MANAGE_EXTERNAL_STORAGE)
                .permission(Permission.CAMERA)
                .request(object : OnPermissionCallback {
                    override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                        onCameraPermissionListener?.onCameraPermission()
                    }

                    override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                        super.onDenied(permissions, never)

                    }
                })
        }
    }

    fun onShowCamera() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
            XXPermissions.with(context)
                    .permission(Permission.READ_EXTERNAL_STORAGE)
                    .permission(Permission.CAMERA)
                    .request(object : OnPermissionCallback {
                        override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
//                            cameraUtils.captureCamera()
                            try {
                                tempFile = createImageFile()
                            } catch (e: IOException) {
                                Toast.makeText(context, "이미지 처리 오류! 다시 시도해주세요.", Toast.LENGTH_SHORT).show()
//                            finish()
                                e.printStackTrace()
                            }
                            if (tempFile != null) {
                                val photoUri =  FileProvider.getUriForFile(context, context.packageName, tempFile!!)
                                onShowCameraListener?.onShowCamera(photoUri)
//                                photoLauncher.launch(photoUri)
                            }
                        }

                        override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                            super.onDenied(permissions, never)

                        }
                    })
        } else {
            XXPermissions.with(context)
                    .permission(Permission.MANAGE_EXTERNAL_STORAGE)
                    .permission(Permission.CAMERA)
                    .request(object : OnPermissionCallback {
                        override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                            try {
                                tempFile = createImageFile()
                            } catch (e: IOException) {
                                Toast.makeText(context, "이미지 처리 오류! 다시 시도해주세요.", Toast.LENGTH_SHORT).show()
//                            finish()
                                e.printStackTrace()
                            }
                            if (tempFile != null) {
                                val photoUri =  FileProvider.getUriForFile(context, context.packageName, tempFile!!)
                                onShowCameraListener?.onShowCamera(photoUri)
//                                photoLauncher.launch(photoUri)
                            }
                        }

                        override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                            super.onDenied(permissions, never)

                        }
                    })
        }
    }

    @Throws(IOException::class)
    fun createImageFile(): File? {

        // 이미지 파일 이름 ( blackJin_{시간}_ )
        val timeStamp: String = SimpleDateFormat("HHmmss").format(Date())
        val imageFileName = "pharmacy" + timeStamp + "_"
        // 이미지가 저장될 폴더 이름 ( blackJin )
        var storageDir: File = if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
            File(NEW_HOME_DIRECTORY)
        } else {
            File("$HOME_DIRECTORY/pharmacy/")
        }
        if (!storageDir.exists()) {
            storageDir.mkdirs()
        }

        // 빈 파일 생성
        return File.createTempFile(imageFileName, ".jpg", storageDir)
    }

    fun onShowCameraAlbum() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
            XXPermissions.with(context)
                    .permission(Permission.READ_EXTERNAL_STORAGE)
                    .permission(Permission.CAMERA)
                    .request(object : OnPermissionCallback {
                        override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                            val intent = Intent(Intent.ACTION_PICK)
                            intent.type = MediaStore.Images.Media.CONTENT_TYPE
                            intent.type = "image/*"
                            onShowGalleryListener?.onShowGallery(intent)
                        }

                        override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                            super.onDenied(permissions, never)

                        }
                    })
        } else {
            XXPermissions.with(context)
                    .permission(Permission.MANAGE_EXTERNAL_STORAGE)
                    .permission(Permission.CAMERA)
                    .request(object : OnPermissionCallback {
                        override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                            val intent = Intent(Intent.ACTION_PICK)
                            intent.type = MediaStore.Images.Media.CONTENT_TYPE
                            intent.type = "image/*"
                            onShowGalleryListener?.onShowGallery(intent)
                        }

                        override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                            super.onDenied(permissions, never)

                        }
                    })
        }
    }

    fun onShowCameraCropAlbum() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
            XXPermissions.with(context)
                .permission(Permission.READ_EXTERNAL_STORAGE)
                .permission(Permission.CAMERA)
                .request(object : OnPermissionCallback {
                    override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                        val intent = Intent("com.android.camera.action.CROP").apply{
                            type = "image/*"
//                            data = mImageCaptureUri
                            putExtra("crop", true)
                            putExtra("outputX", 200)
                            putExtra("outputY", 200)
                            putExtra("aspectX", 1)
                            putExtra("aspectY", 1)
                            putExtra("scale", true)
                            putExtra("return-data", true)
                        }
                        onShowGalleryListener?.onShowGallery(intent)
                    }

                    override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                        super.onDenied(permissions, never)

                    }
                })
        } else {
            XXPermissions.with(context)
                .permission(Permission.MANAGE_EXTERNAL_STORAGE)
                .permission(Permission.CAMERA)
                .request(object : OnPermissionCallback {
                    override fun onGranted(permissions: MutableList<String>?, all: Boolean) {
                        val intent = Intent(Intent.ACTION_PICK)
                        intent.type = MediaStore.Images.Media.CONTENT_TYPE
                        intent.type = "image/*"
                        onShowGalleryListener?.onShowGallery(intent)
                    }

                    override fun onDenied(permissions: MutableList<String>?, never: Boolean) {
                        super.onDenied(permissions, never)

                    }
                })
        }
    }
}