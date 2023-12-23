package com.example.remake2.entity;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CommonUser {

    private String name;
    private String ip;
    private String mask;

    public CommonUser(String name, String ip, String mask) {
        this.name = name;
        this.ip = ip;
        this.mask = mask;
    }

    public CommonUser(String[] text) {
        this.name = text[0];
        this.ip = text[1];
        this.mask = text[2];
    }
}
