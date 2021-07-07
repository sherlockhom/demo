package com.example.demo.service;

import com.example.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyServiceTest {
    @Autowired
    public MyService myService;

    @Test
    public void getStudentInfo() {
        System.out.println("student:"+myService.getStudentInfo(2));
    }

    // @Test
    // public void addStudent(){
    //     Student student = new Student();
    //     for (int i =7;i<100;i++){
    //         student.setId(i);
    //         student.setAge(22);
    //         student.setName("wuming");
    //         myService.addStudent(student);
    //     }
    // }
}