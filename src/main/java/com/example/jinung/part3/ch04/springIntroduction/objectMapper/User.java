package com.example.jinung.part3.ch04.springIntroduction.objectMapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;

    public User() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // object mapper 사용시 get을 넣으면 오류가 날 수 있다.
    public User defaultUser() {
        return new User("default", 0, "010-1111-2222");
    }


    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
    }
}
