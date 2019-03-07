package com.aaa.util;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/3 17:38
 * @Description:
 */
public interface JedisUtil {
    /**
     * 放入缓存
     * @param key
     * @param value
     */
    void putObject(Object key, Object value);
    /**
     * 清除缓存
     * @param arg0
     * @return
     */
    Object removeObject(Object arg0);
    /**
     * 从缓存中获取
     * @param arg0
     * @return
     */
    Object getObject(Object arg0);

}
