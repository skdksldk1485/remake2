package com.example.remake2.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum PersonStatus {

    GOOD("good"),
    BAD("bad"),
    NOTBAD("notbad");

    @Getter
    private final String value;

    PersonStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static PersonStatus from(String value) {
        for (PersonStatus status : PersonStatus.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
