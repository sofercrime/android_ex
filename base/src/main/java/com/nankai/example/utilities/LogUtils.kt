package com.nankai.example.utilities

import android.util.Log
import com.nankai.example.BuildConfig

class LogUtils {
    companion object {
        fun d(tag: String, description: String) {
            if (BuildConfig.DEBUG) {
                Log.d(tag, description)
            }
        }

        fun i(tag: String, description: String) {
            if (BuildConfig.DEBUG) {
                Log.i(tag, description)
            }
        }
    }
}