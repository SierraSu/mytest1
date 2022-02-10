package com.bjpowernode;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
  //定义一个连接池对象
    private static JedisPool pool = null; //Jedis提供的一个连接池对象

    //创建连接池
    public static JedisPool open (String host , int port){

        if (pool == null){
        //要为连接池配置参数
            JedisPoolConfig config =new JedisPoolConfig();
            config.setMaxTotal(10);//最大连接数
            config.setMaxIdle(3);
            config.setTestOnBorrow(true);//测试密码
            pool = new JedisPool(config,host ,port);
        }


        return pool;
    }

    //关闭连接池
    public static void close(){
        if(pool!= null){
            pool.close();
        }
    }
}
