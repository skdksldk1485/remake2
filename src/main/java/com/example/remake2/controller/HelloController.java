package com.example.remake2.controller;

import com.example.remake2.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Example example;

    @RequestMapping("/hello")
    public String hello() {
        return "hello : "+example.getName();
    }

}
