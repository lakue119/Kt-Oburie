package com.lakue.oburie.ui.myresume.upload.active.photo

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemResumeUploadPhotoBinding
import com.lakue.oburie.databinding.ItemResumeUploadVideoBinding

class ResumeUploadActiveVideoAdapter : BaseAdapter() {

    var urls = ArrayList<String>()

    fun addItem(url: String){
        urls.add(url)
        notifyItemInserted(urls.size-1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemResumeUploadVideoBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_resume_upload_video,
            parent,
            false
        ).let {
            return ResumeUploadVideoViewHolder(it)
        }
    }

    override fun getItemCount() = urls.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(urls[position], position)
    }

    /**
     * ViewHolder
     */
    inner class ResumeUploadVideoViewHolder(private val binding: ItemResumeUploadVideoBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                url = item as String
            }
        }
    }
}