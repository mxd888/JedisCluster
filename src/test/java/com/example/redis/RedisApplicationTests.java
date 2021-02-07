package com.example.redis;

import com.example.redis.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisCluster;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;


    @Test
    void test() {
        long start = System.currentTimeMillis();
        System.out.println("finally-mi======" + redisUtil.get("finally-mi"));
        System.out.println("finally-mi2======" + redisUtil.get("finally-mi2"));
        System.out.println("finally======" + redisUtil.get("finally"));
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end-start));
    }


}
