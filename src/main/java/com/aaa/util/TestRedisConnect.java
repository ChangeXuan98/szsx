package com.aaa.util;

import redis.clients.jedis.Jedis;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/3 18:42
 * @Description:
 */
public class TestRedisConnect {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.199.22",6379);
        System.out.println(jedis.ping());
        System.out.println(SerializeUtil.serialize("userList"));
    }
}
