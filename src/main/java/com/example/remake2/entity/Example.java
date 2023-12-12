package com.example.remake2.entity;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Example {

    @Value("${my.name}")
    String name;

}
