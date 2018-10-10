package com.nankai.example.menus.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nankai.example.menus.data.Menu
import com.nankai.example.menus.databinding.ItemMenuBinding

class MenuAdapter : ListAdapter<Menu, MenuAdapter.ViewHolder>(MenuDiffcallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class ViewHolder(
            private val binding: ItemMenuBinding
    ) : RecyclerView.ViewHolder(binding.root){

    }
}