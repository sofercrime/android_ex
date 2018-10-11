package com.nankai.example.menus.utilities

import android.content.Context
import com.nankai.example.menus.data.MenuDao
import com.nankai.example.menus.data.MenuRepository
import com.nankai.example.menus.viewmodels.MenuViewModelFactory

object InjectorUtils {

    fun getMenuRepository(): MenuRepository {
        return MenuRepository.getInstance(MenuDao())
    }

    fun provideMenuViewModelFactory(context: Context): MenuViewModelFactory {
        val repository = getMenuRepository()
        return MenuViewModelFactory(repository, context)
    }
}