package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * User: Wangzhe
 * Date: 2020/10/06 11:56
 * Description:
 * Version: V1.0
 */

@RestController
public class HelloController {
    @Value("${person.name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello()
    {
        return "Hello " + name;
    }
}
