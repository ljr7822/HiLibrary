package com.example.iwen.hilibrary.log;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @author : iwen大大怪
 * create : 2021/01/25 16:26
 */
public class HiLogMo {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.CHINA);
    public long timeMillis;
    public int level;
    public String tag;
    public String log;

    public HiLogMo(long timeMillis, int level, String tag, String log) {
        this.timeMillis = timeMillis;
        this.level = level;
        this.tag = tag;
        this.log = log;
    }

    public String flattenedLog() {
        return getFlattened() + "\n" + log;
    }

    /**
     * 将信息拼接成一个字符串
     */
    public String getFlattened() {
        return format(timeMillis) + '|' + level + '|' + tag + "|:";
    }

    public String format(long timeMillis) {
        return sdf.format(timeMillis);
    }
}
