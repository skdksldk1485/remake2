package com.example.remake2.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("kim") // application.properties 와 바인딩
public class KimProperties {

    String firstName;
    String lastName;
    int age;
    String fullName;
}
