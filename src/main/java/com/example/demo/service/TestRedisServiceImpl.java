package com.example.demo.service;

import com.example.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TestRedisServiceImpl implements TestRedisService{
    @Autowired
    public RedisUtils redisUtils;

    @Override
    public void add(String key, String value) {
        redisUtils.set(key, value);
    }
}
