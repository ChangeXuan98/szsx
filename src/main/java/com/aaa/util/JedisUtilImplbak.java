package com.aaa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/3 18:26
 * @Description:
 */
public class JedisUtilImplbak  {

    @Autowired
    private JedisPool jedisPool;

    public void putObject(Object key, Object value) {
        // TODO Auto-generated method stub
        Jedis resource = jedisPool.getResource();
        resource.set(SerializeUtil.serialize(key.toString()),
                SerializeUtil.serialize(value));
        resource.close();
    }
    public Object removeObject(Object arg0) {
        // TODO Auto-generated method stub
        Jedis resource = jedisPool.getResource();
        Object expire = resource.expire(
                SerializeUtil.serialize(arg0.toString()), 0);
        resource.close();
        return expire;
    }
    public Object getObject(Object arg0) {
        // TODO Auto-generated method stub
        Jedis resource = jedisPool.getResource();
        Object value = SerializeUtil.unserialize(resource.get(
                SerializeUtil.serialize(arg0.toString())));
        resource.close();
        return value;
    }

}
