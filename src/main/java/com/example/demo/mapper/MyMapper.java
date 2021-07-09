package com.example.demo.mapper;

import com.example.demo.dto.StuDto;
import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Param;
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
    StuDto getStudentInfo(int id);

    /**
     * 根据id删除学生信息
     * @param id
     * @return
     */
    int deleteStudentById(int id);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    int modifyStudent(Student student);

    /**
     * 获取所有学生信息
     * @return
     */
    List<StuDto> selectAll();

    /**
     * 分页查询
     * @return
     */
    List<StuDto> selectPage();

    /**
     * 模糊查询
     * @return
     */
    List<StuDto> searchByKeyWord(@Param("field") String field,@Param("keyword") String keyword);
}
