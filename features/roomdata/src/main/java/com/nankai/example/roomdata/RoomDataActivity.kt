package com.nankai.example.roomdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.nankai.example.utilities.NavigationUtil
import kotlinx.android.synthetic.main.activity_room_data.*

class RoomDataActivity : AppCompatActivity() , LifecycleOwner {
    private lateinit var mLifecycleRegistry : LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_room_data)
        activityRoomdataContent.setOnClickListener { _ -> NavigationUtil.goToMenus(this) }
        mLifecycleRegistry = LifecycleRegistry(this)
        mLifecycleRegistry.markState(Lifecycle.State.CREATED)
//        handleDeepLink()
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

    override fun getLifecycle(): Lifecycle {
        return mLifecycleRegistry
    }

//    private fun handleDeepLink() {
//        if (intent.data != null) {
//            val pathSegments = intent.data.pathSegments
//            if (pathSegments.size > 1 && pathSegments[0].equals("cart", ignoreCase = true)) {
//                val fragment = CartActivityFragment()
//                val args = Bundle()
//                args.putString(CartActivityFragment.KEY_CART_ID, pathSegments[1])
//                fragment.setArguments(args)
//                supportFragmentManager.beginTransaction().replace(R.id.content, fragment).commit()
//            }
//        }
//    }
}
