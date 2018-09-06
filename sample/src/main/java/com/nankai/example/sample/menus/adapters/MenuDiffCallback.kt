package com.nankai.example.sample.menus.adapters

import androidx.recyclerview.widget.DiffUtil
import com.nankai.example.sample.menus.data.Menus

class MenuDiffCallback : DiffUtil.ItemCallback<Menus>() {

    override fun areItemsTheSame(oldItem: Menus, newItem: Menus): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Menus, newItem: Menus): Boolean {
        return oldItem == newItem
    }
}