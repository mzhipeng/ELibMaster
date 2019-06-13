package com.m2p.elib.core

import android.content.Context
import android.content.SharedPreferences
import com.m2p.elib.ELibInit

/**
 * Description: SharedPreferences相关
 * Create by dance, at 2018/12/5
 */

fun Any.sp(name: String = ELibInit.sharedPrefName) = ELibInit.context.getSharedPreferences(name, Context.MODE_PRIVATE)

/**
 * 批处理
 */
fun SharedPreferences.edit(action: SharedPreferences.Editor.() -> Unit) {
    edit().apply { action() }.apply()
}

/**
 *  put系列
 */
fun SharedPreferences.putString(key: String, value: String) {
    edit { putString(key, value) }
}

fun SharedPreferences.putInt(key: String, value: Int) {
    edit { putInt(key, value) }
}

fun SharedPreferences.putBoolean(key: String, value: Boolean) {
    edit { putBoolean(key, value) }
}

fun SharedPreferences.putFloat(key: String, value: Float) {
    edit { putFloat(key, value) }
}

fun SharedPreferences.putLong(key: String, value: Long) {
    edit { putLong(key, value) }
}

fun SharedPreferences.putStringSet(key: String, value: Set<String>) {
    edit { putStringSet(key, value) }
}


fun SharedPreferences.clear() {
    edit { clear() }
}
