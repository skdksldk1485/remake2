package com.example.remake2.controller;

import com.example.remake2.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DtoController {

    @RequestMapping("/person")
    public String person(Person person) {
        return person.getId()+", "+person.getName();
    }
}
