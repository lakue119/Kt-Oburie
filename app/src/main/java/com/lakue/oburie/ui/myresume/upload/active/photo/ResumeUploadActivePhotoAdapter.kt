package com.lakue.oburie.ui.myresume.upload.active.photo

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseAdapter
import com.lakue.oburie.base.BaseViewHolder
import com.lakue.oburie.databinding.ItemResumeUploadPhotoBinding

class ResumeUploadActivePhotoAdapter() : BaseAdapter() {

    var photos = ArrayList<Bitmap>()

    fun addItem(photo: Bitmap){
        photos.add(photo)
        notifyItemInserted(photos.size-1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        DataBindingUtil.inflate<ItemResumeUploadPhotoBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_resume_upload_photo,
            parent,
            false
        ).let {
            return HomeCateGoryItemViewHolder(it)
        }
    }

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(photos[position], position)
    }

    /**
     * ViewHolder
     */
    inner class HomeCateGoryItemViewHolder(private val binding: ItemResumeUploadPhotoBinding) : BaseViewHolder(binding.root) {
        override fun onBind(item: Any, pos: Int) {
            binding.apply {
                photo = item as Bitmap
            }
        }
    }
}