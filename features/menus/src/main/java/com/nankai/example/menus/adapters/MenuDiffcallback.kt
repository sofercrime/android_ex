package com.nankai.example.menus.adapters

import androidx.recyclerview.widget.DiffUtil
import com.nankai.example.menus.data.Menu

class MenuDiffcallback : DiffUtil.ItemCallback<Menu>() {

    override fun areItemsTheSame(oldItem: Menu, newItem: Menu): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Menu, newItem: Menu): Boolean {
        return oldItem.title == newItem.title
    }
}