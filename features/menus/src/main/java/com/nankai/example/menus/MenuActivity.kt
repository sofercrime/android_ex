package com.nankai.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.nankai.example.menus.adapters.MenuAdapter
import com.nankai.example.menus.databinding.ActivityMenuBinding
import com.nankai.example.menus.utilities.InjectorUtils
import com.nankai.example.menus.viewmodels.MenuViewModel

class MenuActivity : AppCompatActivity(), LifecycleOwner{

    private lateinit var viewModel: MenuViewModel
    private lateinit var mLifecycleRegistry : LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_menu)
        val  context = baseContext

        val factory = InjectorUtils.provideMenuViewModelFactory(context)
        viewModel = ViewModelProvider(this,factory).get(MenuViewModel::class.java)
        val adapter = MenuAdapter()

        binding.activityMenuList.layoutManager = LinearLayoutManager(context)
        binding.activityMenuList.adapter = adapter
        mLifecycleRegistry = LifecycleRegistry(this)
        mLifecycleRegistry.markState(Lifecycle.State.CREATED)
        subscribeUi(adapter)
    }

    override fun onStart() {
        super.onStart()
        mLifecycleRegistry.markState(Lifecycle.State.STARTED)
    }

    override fun onResume() {
        super.onResume()
        mLifecycleRegistry.markState(Lifecycle.State.RESUMED)
    }

    override fun onDestroy() {
        super.onDestroy()
        mLifecycleRegistry.markState(Lifecycle.State.DESTROYED)
    }

    private fun subscribeUi(adapter: MenuAdapter) {
        viewModel.liveMenuList.observe(this, Observer { menu ->
            if (menu !=null)
                adapter.submitList(menu)
        })
    }

    override fun getLifecycle(): Lifecycle {
        return mLifecycleRegistry
    }
}
