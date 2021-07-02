package com.example.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before(value = "execution(* com.example.demo.controller.HelloController.*(..))")
    public void myBefore(){
        System.out.println("hello,dingxu");
    }

    @After(value = "execution(* com.example.demo.controller.HelloController.*(..))")
    public void myAfter(){
        System.out.println("goodbye,dingxu");
    }
}
