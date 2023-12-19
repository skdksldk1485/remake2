package com.example.remake2.controller;

import com.example.remake2.entity.KimProperties;
import com.example.remake2.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DtoController {

    @Autowired
    KimProperties kimProperties;

    @RequestMapping("/person")
    public String person(Person person) {
        return person.getId()+", "+person.getName()+", "+person.getPersonStatus().getValue();
    }

    @RequestMapping("/kim")
    public String kim() {
        return kimProperties.getFirstName()+", "+kimProperties.getLastName();
    }
}
