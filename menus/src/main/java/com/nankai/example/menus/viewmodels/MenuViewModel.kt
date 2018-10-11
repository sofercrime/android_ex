package com.nankai.example.menus.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.nankai.example.menus.data.Menu
import com.nankai.example.menus.data.MenuRepository

class MenuViewModel internal constructor(
        private val menuRepository: MenuRepository,
        private val context: Context
) : ViewModel() {

    private val menuList = MediatorLiveData<List<Menu>>()
    val liveMenuList:LiveData<List<Menu>> = Transformations.map(menuRepository.getMenus(context)){
        it.filter { it.title.isNotEmpty() }
    }
}