package com.nankai.example.sample.menus.data

class MenuRepository private constructor(private val menus: Menus) {

    companion object {
        @Volatile
        private var instance: MenuRepository? = null

        fun getInstance(menus: Menus) = instance ?: synchronized(this) {
            instance ?: MenuRepository(menus).also { instance = it }
        }
    }
}