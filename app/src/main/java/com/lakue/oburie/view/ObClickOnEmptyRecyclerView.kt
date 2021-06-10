package com.lakue.oburie.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.lakue.oburie.listener.OnEmptyBackgroundClickListener

class ObClickOnEmptyRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): RecyclerView(context, attrs, defStyleAttr) {

    private var clickTriggerRunnable: ClickTriggerRunnable? = null
    private val touchSlop: Int = android.view.ViewConfiguration.get(context).scaledTouchSlop
    private var touchStartPointX = 0.0f
    private var touchStartPointY = 0.0f
    private var onEmptyBackgroundClickListener: OnEmptyBackgroundClickListener? = null

    init {
        this.clipToPadding = false
        this.overScrollMode = View.OVER_SCROLL_NEVER
    }

    fun setOnEmptyBackgroundClickListener(onEmptyBackgroundClickListener: OnEmptyBackgroundClickListener?) {
        this.onEmptyBackgroundClickListener = onEmptyBackgroundClickListener
    }

    override fun onTouchEvent(e: MotionEvent?): Boolean {
        e?.run {
            when (action) {
                MotionEvent.ACTION_DOWN -> {
                    touchStartPointX = x
                    touchStartPointY = y

                    //클릭 이벤트 처리를 위한 runnable 실행
                    clickTriggerRunnable = ClickTriggerRunnable()
                    handler.postDelayed(clickTriggerRunnable!!, 10)
                }
                MotionEvent.ACTION_MOVE -> {
                    val deltaX = Math.abs(touchStartPointX - x)
                    val deltaY = Math.abs(touchStartPointY - y)

                    //클릭에 대한 터치 영역을 벗어날 경우 callback 취소
                    clickTriggerRunnable?.let {
                        if (deltaX > touchSlop || deltaY > touchSlop) {
                            handler.removeCallbacks(clickTriggerRunnable!!)
                            clickTriggerRunnable = null
                        }
                    }
                }
                MotionEvent.ACTION_UP -> {
                    clickTriggerRunnable?.let {
                        val triggered = it.isClickTriggered
                        handler.removeCallbacks(it)
                        clickTriggerRunnable = null

                        return when {
                            triggered -> {
                                //여기에 원하는 클릭 동작을 구현
                                if(onEmptyBackgroundClickListener != null){
                                    onEmptyBackgroundClickListener?.onEmptyBackgroundClick()
                                }
                                true
                            }
                            else -> super.onTouchEvent(this)
                        }
                    }
                }
                else -> super.onTouchEvent(e)
            }
        }
        return super.onTouchEvent(e)
    }


    inner class ClickTriggerRunnable : Runnable {

        var isClickTriggered = false

        override fun run() {
            isClickTriggered = true
        }
    }
}