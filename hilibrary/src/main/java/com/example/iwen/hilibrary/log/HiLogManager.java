package com.example.iwen.hilibrary.log;

import androidx.annotation.NonNull;

/**
 * HiLog的管理类
 *
 * @author : iwen大大怪
 * create : 2021/01/25 1:51
 */
public class HiLogManager {
    private HiLogConfig config;
    private static HiLogManager instance;

    private HiLogManager(HiLogConfig config) {
        this.config = config;
    }

    /**
     * 获取单例
     *
     * @return HiLogManager
     */
    public static HiLogManager getInstance() {
        return instance;
    }

    /**
     * 使用者可以通过调用HiLogManager传递config完成log的初始化
     *
     * @param config HiLogConfig
     */
    public static void init(@NonNull HiLogConfig config) {
        instance = new HiLogManager(config);
    }

    public HiLogConfig getConfig(){
        return config;
    }

}
