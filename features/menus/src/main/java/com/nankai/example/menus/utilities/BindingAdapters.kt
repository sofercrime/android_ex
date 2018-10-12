package com.nankai.example.menus.utilities

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter

class BindingAdapters{

    companion object {
        @BindingAdapter("app:srcVector")
        fun setSrcVector(view:ImageView,@DrawableRes drawableRes: Int){
            view.setImageResource(drawableRes)
        }
    }
}