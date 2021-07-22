package com.example.demo.dto;

import com.example.demo.model.Student;

import java.util.List;

public class ClassDto {
    private int classId;
    private String className;
    List<Student> stuInfo;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(List<Student> stuInfo) {
        this.stuInfo = stuInfo;
    }

    @Override
    public String toString() {
        return "ClassDto{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", stuInfo=" + stuInfo +
                '}';
    }
}
