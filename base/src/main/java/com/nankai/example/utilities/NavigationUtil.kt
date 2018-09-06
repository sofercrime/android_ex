package com.nankai.example.utilities

import android.content.Context
import android.content.Intent
import android.net.Uri

import java.util.Locale

object NavigationUtil {

    private const val ROOT_ENDPOINT = "https://com.nankai.example"

    fun goToRoot(context: Context) {
        invokeDeepLink(context, String.format(Locale.US, "%s/", ROOT_ENDPOINT))
    }

    fun goToSample(context: Context) {
        invokeDeepLink(context, String.format(Locale.US, "%s/sample", ROOT_ENDPOINT))
    }

    private fun invokeDeepLink(context: Context, deepLink: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(deepLink))
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        context.startActivity(intent)
    }

}
