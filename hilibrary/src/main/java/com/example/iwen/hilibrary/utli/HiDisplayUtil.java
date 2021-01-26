package com.example.iwen.hilibrary.utli;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

import androidx.annotation.NonNull;

/**
 * @author : iwen大大怪
 * create : 2021/01/26 20:06
 */
public class HiDisplayUtil {
    /**
     * 根据手机的分辨率从 dip 的单位 转成为 px(像素)
     * applyDimension 是TypedValue的一个静态方法，主要用来将其他尺寸单位（例如dp，sp）转换为像素单位px，
     * 从另一方面说：给尺寸数字加上了单位（java中，尺寸单位一般为px）。
     *
     * @param dp        dp值
     * @param resources Resources
     * @return 转化后的值
     */
    public static int dp2px(float dp, Resources resources) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics());
    }

    /**
     * 获取屏幕宽度
     *
     * @param context 上下文
     * @return 屏幕宽度
     */
    public static int getDisplayWidthInPx(@NonNull Context context) {
        // 获取窗口服务
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (wm != null) {
            Display display = wm.getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            return size.x;
        }
        return 0;
    }

    /**
     * 获取屏幕高度
     *
     * @param context 上下文
     * @return 屏幕高度
     */
    public static int getDisplayHeightInPx(@NonNull Context context) {
        // 获取窗口服务
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (wm != null) {
            Display display = wm.getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            return size.y;
        }
        return 0;
    }
}
