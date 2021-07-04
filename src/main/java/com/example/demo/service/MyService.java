package com.example.demo.service;

import com.example.demo.domain.Student;

import java.util.List;

public interface MyService {
    public Student addStudent(Student student);
    public Student getStudentInfo(int id);
    public int deleteStudentById(int id);
    public int modifyStudent(Student student);
    public List<Student> selectAll();
}
