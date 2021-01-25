package com.example.iwen.hilibrary.log;

/**
 * 线程格式化器
 *
 * @author : iwen大大怪
 * create : 2021/01/25 12:49
 */
public class HiThreadFormatter implements HiLogFormatter<Thread> {
    @Override
    public String format(Thread data) {
        return "Thread:" + data.getName();
    }
}
