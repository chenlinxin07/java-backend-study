package com.study.springbootwebquickstart.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class HelloContreller {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello springboot");
        return "hello springboot";
    }
}
