package com.nankai.example.menus.data

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class Menu(val id: Int, val title: String, val description: String,@Bindable val icon: Int) : BaseObservable()