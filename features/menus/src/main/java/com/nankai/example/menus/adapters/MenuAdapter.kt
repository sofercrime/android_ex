package com.nankai.example.menus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nankai.example.menus.R
import com.nankai.example.menus.data.Menu
import com.nankai.example.utilities.NavigationUtil
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter : ListAdapter<Menu, MenuAdapter.ViewHolder>(MenuDiffcallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = getItem(position)
        holder.apply {
            bindData(createClickListener(menu.id), menu)
            itemView.tag = menu
        }
    }

    private fun createClickListener(id: Int): View.OnClickListener {
        return View.OnClickListener {
            when (id) {
                1 -> {
                    NavigationUtil.goToRoomData(it.context)
                }
            }
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(listener: View.OnClickListener, item: Menu) {
            view.itemMenuIcon.setImageResource(item.icon)
            view.itemMenuTitle.text = item.title
            view.itemMenuDescription.text = item.description
            view.setOnClickListener(listener)
        }
    }
}