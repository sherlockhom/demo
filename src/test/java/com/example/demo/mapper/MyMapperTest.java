package com.example.demo.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMapperTest {

    @Autowired
    public MyMapper myMapper;

    @Test
    public void searchClassInfoByClassId() {
        System.out.println(myMapper.searchClassInfoByClassId(1));
    }

    @Test
    public void getStudentInfo() {
        System.out.println(myMapper.getStudentInfo(1));
    }
}