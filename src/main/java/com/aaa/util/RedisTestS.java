package com.aaa.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: 柴红轩
 * @Date: 2019/3/4 18:26
 * @Description:
 */
public class RedisTestS {
    public static void main(String[] args) {
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("192.168.199.22", 7001));
        nodes.add(new HostAndPort("192.168.199.22", 7002));
        nodes.add(new HostAndPort("192.168.199.22", 7003));
        nodes.add(new HostAndPort("192.168.199.23", 7004));
        nodes.add(new HostAndPort("192.168.199.23", 7005));
        nodes.add(new HostAndPort("192.168.199.23", 7006));
        JedisCluster jedisCluster = new JedisCluster(nodes);
        jedisCluster.set("ccc", "333");
        String ccc = jedisCluster.get("ccc");
        System.out.println(ccc);
    }

}
