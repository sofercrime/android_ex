package com.nankai.example.menus.data

import androidx.test.InstrumentationRegistry
import org.junit.Before
import org.junit.Test

class MenuDaoTest{
    lateinit var menuDao: MenuDao

    @Before fun setUp(){
        menuDao = MenuDao()
    }

    @Test fun test_dummy_data_menus(){
        val context = InstrumentationRegistry.getTargetContext()
        val  menus = menuDao.getMenus(context)

    }
}