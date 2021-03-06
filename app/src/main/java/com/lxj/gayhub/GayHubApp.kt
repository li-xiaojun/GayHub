package com.lxj.gayhub

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.lxj.qingframework.QingFramework
import com.lzy.okgo.OkGo
import com.lzy.okgo.cache.CacheMode

class GayHubApp: Application(){
    companion object {
        lateinit var context: Application
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        OkGo.getInstance().init(this).apply {
            cacheMode = CacheMode.FIRST_CACHE_THEN_REQUEST
        }
        QingFramework.configLog(isEnableLog = BuildConfig.DEBUG, logTag = "GayHub")
    }
}