package com.example.demo.dto;

public class StuDto {
    /**
     * 学生Id
     */
    private int stuId;

    /**
     * 学生年龄
     */
    private String stuAge;

    /**
     * 学生姓名
     */
    private String stuName;

    /**
     * 班级名称
     */
    private String className;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "StuDto{" +
                "stuId=" + stuId +
                ", stuAge='" + stuAge + '\'' +
                ", stuName='" + stuName + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
