package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class MyServiceImpl implements MyService{
    @Autowired
    public MyMapper myMapper;

    @Override
    public Student addStudent(Student student) {
        int add = myMapper.addStudent(student);
        return student;
    }

    @Override
    public Student getStudentInfo(int id) {
        return myMapper.getStudentInfo(id);
    }

    @Override
    public int deleteStudentById(int id) {
        return myMapper.deleteStudentById(id);
    }

    @Override
    public int modifyStudent(Student student) {
        return myMapper.modifyStudent(student);
    }

    @Override
    public List<Student> selectAll() {
        return myMapper.selectAll();
    }
}
