package com.lakue.oburie.ui.chat

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.net.Uri
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityChatBinding
import com.lakue.oburie.listener.OnEmptyBackgroundClickListener
import com.lakue.oburie.ui.chat.appointment.AppointmentActivity.Companion.startAppointmentActivity
import com.lakue.oburie.utils.camera.CameraUtil
import com.lakue.oburie.utils.camera.OnShowCameraListener
import com.lakue.oburie.utils.camera.OnShowGalleryListener
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ChatActivity : BaseActivity<ActivityChatBinding, ChatViewModel>(R.layout.activity_chat) {

    var isShowKeyBoard = false
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
//                    val intent = Intent(this@ChatActivity, ActivityUploadPrescription::class.java)
//                    intent.putExtra("uri", result.data?.data.toString())
//                    startActivity(intent)
                }

            }

    companion object {
        fun startChatActivity(
                context: Context
        ) {
            val intent = Intent(context, ChatActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun onResume() {
        super.onResume()
        binding.apply {
            llContainer.visibility = View.GONE
            ivAttach.isSelected = false
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@ChatActivity
            headTitle = "'라꾸'님과의 대화"
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 860)
            llContainer.layoutParams = params
        }
        cameraUtil = CameraUtil(this)
        isEditTextTouchHide = false
        setKeyboardHeight()
    }

    override fun setUI() {
    }

    override fun setEvent() {
        binding.apply {
            ivAttach.onThrottleClick {
                lifecycleScope.launch {
                    ivAttach.isSelected = !ivAttach.isSelected
                    etChat.requestFocus()
                    if(!isShowKeyBoard && !llContainer.isVisible){
                        llContainer.visibility = View.VISIBLE
                    } else {
                        showAttachImage()
                    }

                }
            }

            etChat.onThrottleClick {
                if(llContainer.isVisible){
                    lifecycleScope.launch {
                        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
//                        showKeyboard() // 키보드 올리는 코드
                        delay(200)
                        llContainer.visibility = View.GONE
                        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                    }
                    ivAttach.isSelected = false
                }
            }
            rvChat.setOnEmptyBackgroundClickListener(object : OnEmptyBackgroundClickListener {
                override fun onEmptyBackgroundClick() {
                    if(!isShowKeyBoard && !llContainer.isVisible){
                        return
                    } else {
                        if(llContainer.isVisible){
                            llContainer.visibility = View.GONE
                        } else {
                            hideKeyboard()
                        }
                        ivAttach.isSelected = false
                    }

                }
            })

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
            }
        }
    }

    override fun setObserve() {
    }


    fun setKeyboardHeight(){
        var rootHeight = -1

        binding.apply{
            root.viewTreeObserver.addOnGlobalLayoutListener {
                if (rootHeight == -1) rootHeight = root.height // 매번 호출되기 때문에, 처음 한 번만 값을 할당해준다.
                val visibleFrameSize = Rect()
                root.getWindowVisibleDisplayFrame(visibleFrameSize)
                val heightExceptKeyboard = visibleFrameSize.bottom - visibleFrameSize.top
                // 키보드를 제외한 높이가 디바이스 root_view보다 높거나 같다면, 키보드가 올라왔을 때가 아니므로 거른다.
                if (heightExceptKeyboard < rootHeight) {
                    if(!isShowKeyBoard){
                        isShowKeyBoard = true
                    }
                    // 키보드 높이
                    val keyboardHeight = rootHeight - heightExceptKeyboard

                    val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, keyboardHeight)
                    llContainer.layoutParams = params

                } else {
                    if(isShowKeyBoard){
                        isShowKeyBoard = false
                        binding.apply{
                            if(!llContainer.isVisible){
                                ivAttach.isSelected = false
                            }
                        }
                    }
                }
                Log.i("QWKRLJLKQWR", "${isShowKeyBoard}")
            }
        }
    }

    fun showAttachImage(){
        // 이모티콘 버튼 클릭시 매번 호출되는 코드
        lifecycleScope.launch {
            binding.apply{
                if (ivAttach.isSelected) { // 상황 1
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
                    llContainer.visibility = View.VISIBLE
                    hideKeyboard()
                    delay(100)
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                } else { // 상황 2
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
                    showKeyboard() // 키보드 올리는 코드
                    delay(200)
                    llContainer.visibility = View.GONE
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

                }
            }
        }
    }

    fun showCamera(){
        cameraUtil.onShowCamera()
    }

    fun showGallery(){
        cameraUtil.onShowCameraAlbum()
    }

    fun showAppointment(){
        startAppointmentActivity(this@ChatActivity)
    }

    override fun onBackPressed() {
        binding.apply{
            if(llContainer.isVisible){
                llContainer.isVisible = false
                ivAttach.isSelected = false
            } else {
                super.onBackPressed()
            }
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_DOWN) {
            onUserInteraction()
        }
        return if (window.superDispatchTouchEvent(ev)) {
            true
        } else onTouchEvent(ev)
    }

}