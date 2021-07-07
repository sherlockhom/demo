package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;

import java.util.List;

public interface MyService {
    Student addStudent(Student student);
    Student getStudentInfo(int id);
    int deleteStudentById(int id);
    int modifyStudent(Student student);
    List<Student> selectAll();
    PageResult findPage(PageRequest pageRequest);
    List<Student> searchByKeyWord(String field,String keyword);
}
