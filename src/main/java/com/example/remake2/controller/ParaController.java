package com.example.remake2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ParaController {

    @RequestMapping("/para")
    public String para(HttpServletRequest request) {
        // http://localhost:8080/para?id=aaa


        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(30);
        arrList.add(20);
        arrList.add(10);

        arrList.remove(1);

        for (int e : arrList) {
            System.out.print(e + " ");
        }

        String str = request.getParameter("id")+arrList.get(0);

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
