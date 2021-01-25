package com.example.iwen.hilibrary.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.iwen.hilibrary.R
import com.example.iwen.hilibrary.log.HiLog
import com.example.iwen.hilibrary.log.HiLogConfig
import com.example.iwen.hilibrary.log.HiLogType

class HiLogDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_log_demo)
        findViewById<View>(R.id.btn_log).setOnClickListener {
            printLog()
        }
    }

    private fun printLog(){
        // 自定义Log配置
        HiLog.log(object :HiLogConfig(){
            override fun includeTread(): Boolean {
                return true
            }

            override fun stackTraceDepth(): Int {
                return 0
            }
        },HiLogType.E,"-----","5566")
        HiLog.a("9900");
    }
}