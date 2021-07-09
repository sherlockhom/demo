package com.example.demo.controller;

import com.example.demo.dto.StuDto;
import com.example.demo.model.Student;
import com.example.demo.service.MyService;
import com.example.demo.utils.PageRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Controller
 * @ResponseBody 该方法的返回结果直接写到Http response Body中，解析成相应的json格式
 * @RestController 相当于以上两个注解
 * @Api 通常用来为Controller类做注释，说明Controller的职能
 * @ApiOperation 通常用来为一个接口做注释,说明接口的职能
 */
@Api(tags = "学生管理",description = "student")
@Slf4j
@RestController
@RequestMapping("/student")
public class HelloController {

    @Autowired
    private MyService myService;

    @ApiOperation("添加")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Student addStudent(Student student){
        return myService.addStudent(student);
    }

    @ApiOperation("查单条信息")
    @RequestMapping(value = "getStudent/{id}",method = RequestMethod.POST)
    public StuDto getStudent(@PathVariable int id){
        return myService.getStudentInfo(id);
    }

    @ApiOperation("删除")
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public String delete(int id){
        int result = myService.deleteStudentById(id);
        if (result >= 1){
            return "删除成功";
        }
        else{
            return "删除失败";
        }
    }

    @ApiOperation("修改")
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

    @ApiOperation("查看列表")
    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public List<StuDto> ListStudent(){
        return myService.selectAll();
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findPage",method = RequestMethod.POST)
    public Object findPage(@RequestBody PageRequest pageRequest){
        return myService.findPage(pageRequest);
    }

    @ApiOperation("模糊查询")
    @RequestMapping(value = "/searchByKeyword",method = RequestMethod.POST)
    public List<StuDto> getStudentByKeyword(String field,String keyword){
        return myService.searchByKeyWord(field,keyword);
    }


}
