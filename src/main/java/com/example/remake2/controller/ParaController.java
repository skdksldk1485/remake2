package com.example.remake2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParaController {

    @RequestMapping("/para")
    public String para(HttpServletRequest request) {
        // http://localhost:8080/para?id=aaa

        String str = request.getParameter("id");

        return str;
    }
}
