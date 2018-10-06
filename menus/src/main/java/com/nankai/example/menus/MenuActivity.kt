package com.nankai.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nankai.example.menus.databinding.ActivityMenuBinding
import com.nankai.example.utilities.NavigationUtil
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_menu)
        content.setOnClickListener { _ -> NavigationUtil.goToRoomData(this) }
    }
}
