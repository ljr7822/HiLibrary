package com.example.iwen.hilibrary

import android.app.Application
import com.example.iwen.hilibrary.log.HiConsolePrinter
import com.example.iwen.hilibrary.log.HiLogConfig
import com.example.iwen.hilibrary.log.HiLogManager
import com.google.gson.Gson

/**
 * @author : iwen大大怪
 * create : 2021/01/25 2:14
 */
class MApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object :HiLogConfig(){
            override fun injectJsonParser(): JsonParser {
                return JsonParser { src -> Gson().toJson(src) }
            }
            override fun getGlobalTag(): String {
                return "MApplication"
            }

            override fun enable(): Boolean {
                return true
            }
        },HiConsolePrinter())
    }
}