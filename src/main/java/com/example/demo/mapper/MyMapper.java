package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyMapper {
    /**
     *新增学生
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    Student getStudentInfo(int id);

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    int deleteStudentById(int id);

    /**
     * 根据id获取学生信息
     * @param student
     * @return
     */
    int modifyStudent(Student student);

    /**
     * 根据id获取学生信息
     * @return
     */
    List<Student> selectAll();

    /**
     * 分页查询
     * @return
     */
    List<Student> selectPage();
}
