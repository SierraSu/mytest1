package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class App1
{
    public static void main( String[] args ) {
        try {

            JedisPool pool = null;
            //获取连接池
            pool = RedisUtils.open("127.0.0.1", 6379);
            //过去连接
            Jedis jedis = pool.getResource();
            jedis.flushAll();
            jedis.set("password", "123");
            System.out.println(jedis.get("password"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
