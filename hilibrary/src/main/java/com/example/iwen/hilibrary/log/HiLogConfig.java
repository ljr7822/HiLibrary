package com.example.iwen.hilibrary.log;

/**
 * Log的配置类
 *
 * @author : iwen大大怪
 * create : 2021/01/25 1:48
 */
public  abstract class HiLogConfig {
    public String getGlobalTag(){
        return "HiLog";
    }

    public boolean enable(){
        return true;
    }
}
