package com.example.iwen.hilibrary.log;

/**
 * Log的配置类
 *
 * @author : iwen大大怪
 * create : 2021/01/25 1:48
 */
public abstract class HiLogConfig {
    static int MAX_LEN = 512;
    static HiStackTraceFormatter HI_STACK_TRACE_FORMATTER = new HiStackTraceFormatter();
    static HiThreadFormatter HI_THREAD_FORMATTER = new HiThreadFormatter();

    /**
     * 接口方法，让用户苦可以通过配置完成json序列化器的注入
     */
    public JsonParser injectJsonParser() {
        return null;
    }

    public String getGlobalTag() {
        return "HiLog";
    }

    /**
     * 是否使用日志
     *
     * @return 默认使用
     */
    public boolean enable() {
        return true;
    }

    /**
     * 日志里面是否报名线程信息
     *
     * @return 默认为false不包含
     */
    public boolean includeTread() {
        return false;
    }

    /**
     * 配置堆栈信息的深度
     *
     * @return 默认为5
     */
    public int stackTraceDepth() {
        return 5;
    }

     public HiLogPrinter[] printers(){
        return null;
     }

    /**
     * 序列化接口
     */
    public interface JsonParser {
        String toJson(Object src);
    }
}
