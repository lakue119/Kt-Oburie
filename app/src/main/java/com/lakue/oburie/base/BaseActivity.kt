package com.lakue.oburie.base

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelLazy
import androidx.lifecycle.observe
import com.lakue.oburie.R
import com.lakue.oburie.listener.OnThrottleClickListener
import com.lakue.oburie.utils.Event
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.reflect.ParameterizedType

abstract class BaseActivity<B : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes val layoutId: Int
) : AppCompatActivity() {

    var mToast: Toast? = null
    var isShowToast = false

    lateinit var binding: B
    var isEditTextTouchHide = true

    var loadingDialog: AppCompatDialog? = null

    private val viewModelClass = ((javaClass.genericSuperclass as ParameterizedType?)
        ?.actualTypeArguments
        ?.get(1) as Class<VM>).kotlin

    protected open val viewModel by ViewModelLazy(
        viewModelClass,
        { viewModelStore },
        { defaultViewModelProviderFactory }
    )

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this

        init()
        setUI()
        setEvent()
        setObserve()
    }

    abstract fun init()
    abstract fun setUI()
    abstract fun setEvent()
    abstract fun setObserve()

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }

    @SuppressLint("ShowToast")
    protected fun showToast(msg: String?) {
        if (mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_LONG)
        }

        val inflater = layoutInflater
        // Custom 레이아웃 Imflatation '인플레이션', 레이아웃 메모리에 객체화
        val layout: View = inflater.inflate(
            R.layout.toast_custom,
            findViewById<View>(R.id.toast_custom) as? ViewGroup
        )
        // 보여줄 메시지 설정 위해 TextView 객체 연결, 인플레이션해서 생성된 View를 통해 findViewById 실행
        val message: TextView = layout.findViewById(R.id.tv_toast)
        message.text = msg
        mToast?.view = layout
        mToast?.show()
        isShowToast = true
//        Handler().postDelayed({ //여기에 딜레이 후 시작할 작업들을 입력
//            if (isShowToast) {
//                mToast?.cancel()
//                isShowToast = false
//            }
//        }, 1500) // 0.5초 정도 딜레이를 준 후 시작
    }
//    protected fun onKeyboardHide(editText: EditText) {
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(editText.windowToken, 0)
//    }
//
//    protected fun View.onThrottleClick(action: (v: View) -> Unit) {
//        val listener = View.OnClickListener { action(it) }
//        setOnClickListener(OnThrottleClickListener(listener))
//    }

    protected fun Context.showKeyboard() {
        GlobalScope.launch {
            delay(100)
            (getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager).toggleSoftInput(
                InputMethodManager.SHOW_FORCED,
                0
            )
        }
    }

    protected fun Context.hideKeyboard() {
        (getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager).toggleSoftInput(
            InputMethodManager.HIDE_IMPLICIT_ONLY,
            0
        )
    }

    protected fun View.onThrottleClick(action: (v: View) -> Unit) {
        val listener = View.OnClickListener { action(it) }
        setOnClickListener(OnThrottleClickListener(listener))
    }

    //null이면 ""으로 변환
    protected fun String.ifNullEmpty(): String {
        return if (this.isNullOrEmpty()) {
            ""
        } else {
            this
        }
    }

    protected fun String.isNullToEmpty(): String {
        return if (this == "null") {
            ""
        } else {
            this
        }
    }

    protected fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

    protected infix fun <T> LiveData<Event<T>>.eventObserve(action: (T) -> Unit) {
        observe(this@BaseActivity) {
            it.get(action)
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if(isEditTextTouchHide){
            val focusView = currentFocus
            if (focusView != null) {
                val rect = Rect()
                focusView.getGlobalVisibleRect(rect)
                val x = ev.x.toInt()
                val y = ev.y.toInt()
                if (!rect.contains(x, y)) {
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(focusView.windowToken, 0)
                    focusView.clearFocus()
                }
            }
        }

        return super.dispatchTouchEvent(ev)
    }

    fun showLoading(){
        if(this == null || this.isFinishing){
            return
        }

        if(loadingDialog != null && loadingDialog?.isShowing!!){

        } else {
            loadingDialog = AppCompatDialog(this)
            loadingDialog?.apply{
                setCancelable(false)
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                setContentView(R.layout.progress_loading)
                show()
            }
        }
    }

    fun hideLoading(){
        if(loadingDialog != null && loadingDialog?.isShowing!!){
            loadingDialog?.dismiss()
        }
    }
}