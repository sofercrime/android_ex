package com.nankai.example.menus.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nankai.example.menus.data.MenuRepository

class MenuViewModelFactory(
        private val repository: MenuRepository,
        private val context: Context
): ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = MenuViewModel(repository,context) as T
}