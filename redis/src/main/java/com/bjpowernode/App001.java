package com.bjpowernode;


import redis.clients.jedis.Jedis;

public class App001
{
    public static void main( String[] args )
    {

      //创建连接,连接redis服务器 , 测试能不能拿到
        Jedis jedis = new Jedis("127.0.0.1" , 6379);
        System.out.println(jedis.get("username"));

    }
}
