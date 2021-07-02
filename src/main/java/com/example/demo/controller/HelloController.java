package com.example.demo.controller;

import com.example.demo.dao.Student;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
    @Controller
    @ResponseBody 该方法的返回结果直接写到Http response Body中，解析成相应的json格式
    @RestController相当于以上两个注解
 */
@RestController
@RequestMapping("/student")
public class HelloController {

    @Autowired
    private MyService myService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Student addStudent(Student student){
        return myService.addStudent(student);
    }

    @RequestMapping(value = "getStudent/{id}",method = RequestMethod.GET)
    public Student getStudent(@PathVariable int id){
        return myService.getStudentInfo(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id){
        int result = myService.deleteStudentById(id);
        if (result >= 1){
            return "删除成功";
        }
        else{
            return "删除失败";
        }
    }

    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    public String modify(Student student){
        int res = myService.modifyStudent(student);
        if (res >= 1){
            return "修改成功";
        }
        else {
            return "修改失败";
        }
    }
}
