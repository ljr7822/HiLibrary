package com.example.iwen.hilibrary.log;

/**
 * 日志格式化接口
 *
 * @author : iwen大大怪
 * create : 2021/01/25 12:48
 */
public interface HiLogFormatter<T> {
    String format(T data);
}
