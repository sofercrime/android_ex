package com.nankai.example.menus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nankai.example.menus.data.Menu
import com.nankai.example.menus.databinding.ItemMenuBinding
import com.nankai.example.utilities.NavigationUtil

class MenuAdapter : ListAdapter<Menu, MenuAdapter.ViewHolder>(MenuDiffcallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = getItem(position)
        holder.apply {
            bindData(createClickListenener(menu.id), menu)
            itemView.tag = menu
        }
    }

    private fun createClickListenener(id: Int): View.OnClickListener {
        return View.OnClickListener {
            when (id) {
                1 -> {
                    NavigationUtil.goToRoomData(it.context)
                }
            }
        }
    }

    class ViewHolder(
            private val binding: ItemMenuBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(listener: View.OnClickListener, item: Menu) {
            binding.apply {
                menus = item
                clickListener = listener
            }
        }
    }
}