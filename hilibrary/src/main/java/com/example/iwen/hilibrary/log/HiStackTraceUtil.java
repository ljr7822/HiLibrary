package com.example.iwen.hilibrary.log;

/**
 * 堆栈信息工具类
 *
 * @author : iwen大大怪
 * create : 2021/01/25 15:41
 */
public class HiStackTraceUtil {
    /**
     * 获取裁剪的真实堆栈信息
     *
     * @param stackTrace    传进来的堆栈信息
     * @param ignorePackage 要忽略的包名
     * @param maxDepth      允许堆栈信息的深度
     * @return 裁剪的真实堆栈信息
     */
    public static StackTraceElement[] getCroppedRealStackTrack(StackTraceElement[] stackTrace, String ignorePackage, int maxDepth) {
        return cropStackTrace(getRealStackTrack(stackTrace,ignorePackage),maxDepth);
    }

    /**
     * 获取真实的堆栈信息
     *
     * @param stackTrace    传递进来的堆栈信息
     * @param ignorePackage 要忽略的包名
     * @return 真实的堆栈信息
     */
    private static StackTraceElement[] getRealStackTrack(StackTraceElement[] stackTrace, String ignorePackage) {
        // 默认忽略长度为0
        int ignoreDepth = 0;
        // 获取堆栈信息的长度
        int allDepth = stackTrace.length;
        String className;
        for (int i = allDepth - 1; i >= 0; i--) {
            className = stackTrace[i].getClassName();
            if (ignorePackage != null && className.startsWith(ignorePackage)) {
                ignoreDepth = i + 1;
                break;
            }
        }
        int realDepth = allDepth - ignoreDepth;
        StackTraceElement[] realStack = new StackTraceElement[realDepth];
        System.arraycopy(stackTrace, ignoreDepth, realStack, 0, realDepth);
        return realStack;
    }

    /**
     * 裁剪堆栈信息
     *
     * @param callStack 传递进来的原始堆栈信息
     * @param maxDepth  最大深度
     * @return 裁剪后的堆栈信息
     */
    private static StackTraceElement[] cropStackTrace(StackTraceElement[] callStack, int maxDepth) {
        int realDepth = callStack.length;
        if (realDepth > 0) {
            realDepth = Math.min(maxDepth, realDepth);
        }
        StackTraceElement[] realStack = new StackTraceElement[realDepth];
        System.arraycopy(callStack, 0, realStack, 0, realDepth);
        return realStack;
    }


}
