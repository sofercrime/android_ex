package com.nankai.example.utilities

import android.content.Context
import android.content.Intent
import android.net.Uri

import java.util.Locale

object NavigationUtil {

    private const val ROOT_ENDPOINT = "https://bumblebee.willowtreeapps.com"

    fun goToRoot(context: Context) {
        invokeDeepLink(context, String.format(Locale.US, "%s/", ROOT_ENDPOINT))
    }

    fun goToItem(context: Context, itemId: Long) {
        invokeDeepLink(context, String.format(Locale.US, "%s/item/%d/", ROOT_ENDPOINT, itemId))
    }

    fun goToCart(context: Context, cartId: String) {
        invokeDeepLink(context, String.format(Locale.US, "%s/cart/%s/", ROOT_ENDPOINT, cartId))
    }

    private fun invokeDeepLink(context: Context, deepLink: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(deepLink))
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        context.startActivity(intent)
    }

}
