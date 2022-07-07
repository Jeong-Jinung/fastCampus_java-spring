package com.example.hello.part3.designPattern.strategy;

public class AppendStrategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return "ABCD " + text;
    }
}
