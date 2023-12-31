package com.example.remake2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParaController {

    @RequestMapping("/para")
    public String para(HttpServletRequest request) {
        // http://localhost:8080/para?id=aaa

        String str = request.getParameter("id");

        return str;
    }

    @RequestMapping("/para/{number}")
    public int para2(@PathVariable Integer number) {
        // http://localhost:8080/para/3

        int num = number;

        return num;
    }

    @RequestMapping("/param")
    public String para3(@RequestParam String str, @RequestParam Integer num) {
        // http://localhost:8080/param?str=aaa&num=3

        String wording = str;
        int number = num;

        return wording + number;
    }
}
