package com.m2p.elib

import android.annotation.SuppressLint
import android.content.Context
import com.tencent.mmkv.MMKV

/**
 * Created by zhipeng on 2019/6/13 0013.
 *
 * @author mzp
 */
@SuppressLint("StaticFieldLeak")
object ELibInit {

    lateinit var context: Context
    var isDebug = true
    var defaultLogTag = "elib"
    var sharedPrefName = "elib"

    /**
     * 初始化配置信息，必须调用
     * @param isDebug 是否是debug模式，默认为true
     */
    fun init(
        context: Context,
        isDebug: Boolean = true,
        defaultLogTag: String = ELibInit.defaultLogTag,
        sharedPrefName: String = ELibInit.sharedPrefName
    ) {
        this.context = context
        this.isDebug = isDebug
        this.defaultLogTag = defaultLogTag
        this.sharedPrefName = sharedPrefName
        MMKV.initialize(this.context)
    }

}