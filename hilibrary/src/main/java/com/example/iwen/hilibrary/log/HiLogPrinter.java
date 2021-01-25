package com.example.iwen.hilibrary.log;

import androidx.annotation.NonNull;

/**
 * 日志打印接口
 *
 * @author : iwen大大怪
 * create : 2021/01/25 12:44
 */
public interface HiLogPrinter {
    /**
     * 日志打印的方法
     *
     * @param config      读取配置
     * @param level       日志级别
     * @param tag         tag
     * @param printString 打印内容
     */
    void print(@NonNull HiLogConfig config, int level, String tag, @NonNull String printString);
}
