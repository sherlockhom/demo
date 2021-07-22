package com.example.demo.controller;

import com.example.demo.service.TestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
@Transactional
public class TestRedisController {
    @Autowired
    public TestRedisService testRedisService;

    @RequestMapping("/add")
    public String add(String key, String value){
        testRedisService.add(key, value);
        return "成功添加到redis数据库中";
    }

}
