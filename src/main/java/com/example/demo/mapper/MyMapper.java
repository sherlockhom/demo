package com.example.demo.mapper;

import com.example.demo.dao.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMapper {
    int addStudent(Student student);
    Student getStudentInfo(int id);
    int deleteStudentById(int id);
    int modifyStudent(Student student);
}
