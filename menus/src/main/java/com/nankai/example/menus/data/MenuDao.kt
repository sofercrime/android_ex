package com.nankai.example.menus.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nankai.example.menus.R

class MenuDao {
    public fun getMenus(context: Context): LiveData<List<Menu>> {
        val menus = mutableListOf<Menu>()
        for (i in 1..3) {
            val resource = context.resources
            menus.add(
                    Menu(
                            i
                            , resource.getStringArray(R.array.menus_title)[i]
                            , resource.getStringArray(R.array.menus_description)[i]
                            , resource.getIntArray(R.array.menus_icon)[i]
                    ))
        }
        val mutableList = MutableLiveData<List<Menu>>()
        mutableList.postValue(menus)
        return mutableList
    }
}