package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel("学生模型")
//table与数据库中的表相对应
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @ApiModelProperty("学生id")
    //@Id设置主键
    private Integer id;

    @ApiModelProperty("学生姓名")
    private String name;

    @ApiModelProperty("学生年龄")
    private Integer age;

    @ApiModelProperty("班级编号")
    private Integer classId;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                '}';
    }
}
