package com.etwicaksono.infomovie.utils

import android.content.Context
import java.io.IOException
import kotlin.math.floor

fun getJsonDataFromAsset(context: Context, fileName: String): String? {
    val jsonString: String
    try {
        jsonString = context.assets.open(fileName).bufferedReader().use {
            it.readText()
        }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return null
    }
    return jsonString
}

fun getRuntime(input: Int): String {
    val hour = floor((input.toDouble() / 60)).toInt().toString()
    val minutes = (input % 60).toString()
    return  "${hour}h ${minutes}m"
}