package com.example.remake2.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {
    String id;
    String name;
    PersonStatus personStatus;
}
