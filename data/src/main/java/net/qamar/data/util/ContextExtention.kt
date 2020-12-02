package net.qamar.data.util

import android.content.Context
import android.net.ConnectivityManager


fun Context.isNetworkConnected(context: Context):Boolean {
    val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    return cm.activeNetworkInfo != null
}


