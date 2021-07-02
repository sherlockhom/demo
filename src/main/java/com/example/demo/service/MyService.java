package com.example.demo.service;

import com.example.demo.dao.Student;

public interface MyService {
    public Student addStudent(Student student);
    public Student getStudentInfo(int id);
    public int deleteStudentById(int id);
    public int modifyStudent(Student student);
}
