package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@Controller
@Api(tags = "登录",description = "login")
public class LoginController {
    @Autowired
    public UserService userService;

    @ApiOperation("跳转登录界面")
    @RequestMapping(value = "/login")
    public String toLogin(HttpSession session){
        return "login";
    }

    @ApiOperation("登录")
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password,HttpSession session){
        User user = userService.getUserInfo(name,password);
        if (user != null){
            session.setAttribute("user",name);
            return "redirect:success.html";
        }
        else {
            return "login";
        }
    }
}
