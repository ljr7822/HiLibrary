package com.example.iwen.hilibrary.log;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HiLog的管理类
 *
 * @author : iwen大大怪
 * create : 2021/01/25 1:51
 */
public class HiLogManager {
    private HiLogConfig config;
    private static HiLogManager instance;
    // 创建数组保存打印器
    private List<HiLogPrinter> printers = new ArrayList<>();

    private HiLogManager(HiLogConfig config,HiLogPrinter[] printers) {
        this.config = config;
        this.printers.addAll(Arrays.asList(printers));
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
    public static void init(@NonNull HiLogConfig config,HiLogPrinter... printers) {
        instance = new HiLogManager(config,printers);
    }

    public HiLogConfig getConfig(){
        return config;
    }

    public List<HiLogPrinter> getPrinters(){
        return printers;
    }

    public void addPrinter(HiLogPrinter printer){
        printers.add(printer);
    }

    public void removePrinter(HiLogPrinter printer){
        if (printers!=null){
            printers.remove(printer);
        }
    }

}
