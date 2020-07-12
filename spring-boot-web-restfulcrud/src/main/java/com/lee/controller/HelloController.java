package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Administrator
 * @create 2020/7/12 11:12
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}
