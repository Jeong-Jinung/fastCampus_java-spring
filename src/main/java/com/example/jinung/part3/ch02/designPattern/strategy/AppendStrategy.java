package com.example.jinung.part3.ch02.designPattern.strategy;

public class AppendStrategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return "ABCD " + text;
    }
}
