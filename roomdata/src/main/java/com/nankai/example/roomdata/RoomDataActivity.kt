package com.nankai.example.roomdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nankai.example.roomdata.databinding.ActivityRoomDataBinding
import com.nankai.example.utilities.NavigationUtil
import kotlinx.android.synthetic.main.activity_room_data.*

class RoomDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding: ActivityRoomDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_room_data)
        content.setOnClickListener { _ -> NavigationUtil.goToMenus(this) }
    }
}
