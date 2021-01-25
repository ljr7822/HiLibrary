package com.example.iwen.hilibrary.log;

import android.util.Log;

import androidx.annotation.NonNull;

import static com.example.iwen.hilibrary.log.HiLogConfig.MAX_LEN;

/**
 * 控制台打印器
 *
 * @author : iwen大大怪
 * create : 2021/01/25 14:43
 */
public class HiConsolePrinter implements HiLogPrinter {
    @Override
    public void print(@NonNull HiLogConfig config, int level, String tag, @NonNull String printString) {
        // 获取要打印的string的长度
        int len = printString.length();
        // 获取行数
        int countOfSub = len / MAX_LEN;
        if (countOfSub > 0) {
            // 遍历每一行都打印出来
            int index = 0;
            for (int i = 0; i < countOfSub; i++) {
                Log.println(level, tag, printString.substring(index, index + MAX_LEN));
                index += MAX_LEN;
            }
            if (index != len) {
                Log.println(level, tag, printString.substring(index, len));
            }
        }else {
            Log.println(level,tag,printString);
        }
    }
}
