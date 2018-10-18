package com.nankai.example.menus.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nankai.example.menus.R

class MenuDao {
    fun getMenus(context: Context): LiveData<List<Menu>> {

        val menus = mutableListOf<Menu>()
        val resource = context.resources

        val icons = resource.obtainTypedArray(R.array.menus_icon)

        for (i in 0..2) {
          val iconId =   icons.getResourceId(i, -1)
            menus.add(
                    Menu(
                            i
                            , resource.getStringArray(R.array.menus_title)[i]
                            , resource.getStringArray(R.array.menus_description)[i]
                            , iconId
                    ))
        }
        val mutableList = MutableLiveData<List<Menu>>()
        mutableList.postValue(menus)

        icons.recycle()
        return mutableList
    }
}