package com.nankai.example.sample.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nankai.example.sample.R
import com.nankai.example.sample.databinding.ActivityMenuListBinding
import com.nankai.example.sample.menus.adapters.MenuAdapter

class MenuListActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMenuListBinding = DataBindingUtil.setContentView(this, R.layout.activity_menu_list)
        val adapter = MenuAdapter()
        findViewById<RecyclerView>(R.id.list_menus).adapter = adapter

        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter: MenuAdapter) {

    }
}
