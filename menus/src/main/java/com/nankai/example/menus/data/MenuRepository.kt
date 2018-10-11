package com.nankai.example.menus.data

import android.content.Context

class MenuRepository(private val menuDao: MenuDao) {

    fun getMenus(context: Context) = menuDao.getMenus(context)

    companion object {
        //For singleton instantiation
        @Volatile
        private var instance: MenuRepository? = null

        fun getInstance(menuDao: MenuDao) = instance ?: synchronized(this) {
            instance ?: MenuRepository(menuDao).also { instance = it }
        }
    }
}