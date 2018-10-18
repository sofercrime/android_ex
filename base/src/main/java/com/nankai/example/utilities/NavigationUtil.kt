package com.nankai.example.utilities

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import java.util.Locale

object NavigationUtil {

    private const val ROOT_ENDPOINT = "https://instantapp.com.nankai.example"

    fun goToRoot(context: Context) {
        invokeDeepLink(context, String.format(Locale.US, "%s/", ROOT_ENDPOINT))
    }

    fun goToMenus(context: Context) {
        invokeDeepLink(context, String.format(Locale.US, "%s/menus", ROOT_ENDPOINT))
    }

    fun goToRoomData(context: Context){
        invokeDeepLink(context,String.format(Locale.US,"%s/roomdata", ROOT_ENDPOINT))
    }

    fun goToNavigation(context: Context){
        invokeDeepLink(context,String.format(Locale.US,"%s/navigation", ROOT_ENDPOINT))
    }

    fun goToWorker(context: Context){
        invokeDeepLink(context,String.format(Locale.US,"%s/worker", ROOT_ENDPOINT))
    }

    private fun invokeDeepLink(context: Context, deepLink: String) {

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(deepLink))
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        context.startActivity(intent)
    }

}
