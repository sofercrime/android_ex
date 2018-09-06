package com.nankai.example.sample.menus.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nankai.example.sample.databinding.ItemMenuBinding
import com.nankai.example.sample.menus.data.Menus

class MenuAdapter : ListAdapter<Menus, MenuAdapter.ViewHolder>(MenuDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val menu = getItem(position)
        holder.apply {
            bind(createOnClickListener(menu.id),menu)
            itemView.tag = menu
        }
    }

    private fun createOnClickListener(menuId:String): View.OnClickListener{
        return View.OnClickListener {
            Toast.makeText(it.context,String.format("Show nav id =[$1%s]",menuId),Toast.LENGTH_LONG).show()
        }
    }

    class ViewHolder(
            private val binding: ItemMenuBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(listener: View.OnClickListener,item: Menus){
            binding.apply{
                clickListener = listener
                executePendingBindings()
            }
        }
    }
}