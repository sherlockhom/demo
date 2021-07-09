package com.example.demo.service;

import com.example.demo.dto.StuDto;
import com.example.demo.model.Student;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;

import java.util.List;

public interface MyService {
    /***
     * 添加学生
     * @param student
     * @return
     */
    Student addStudent(Student student);

    /***
     * 获取学生信息
     * @param id
     * @return
     */
    StuDto getStudentInfo(int id);

    /***
     * 删除学生信息
     * @param id
     * @return
     */
    int deleteStudentById(int id);

    /***
     * 修改学生信息
     * @param student
     * @return
     */
    int modifyStudent(Student student);

    /***
     * 获取所有学生信息
     * @return
     */
    List<StuDto> selectAll();

    /***
     * 分页获取学生信息
     * @param pageRequest
     * @return
     */
    PageResult findPage(PageRequest pageRequest);

    /***
     * 关键字查询学生信息
     * @param field
     * @param keyword
     * @return
     */
    List<StuDto> searchByKeyWord(String field,String keyword);
}
