package com.nankai.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nankai.example.sample.data.MenuBean
import com.nankai.example.sample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        findViewById<RecyclerView>(R.id.list_menu).adapter =
    }

    class MenuAdapter() : ListAdapter<MenuBean,MenuAdapter.ViewHolder>() {

        class ViewHolder(private val binding:) {

        }

    }

}
