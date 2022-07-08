package com.example.jinung.part3.ch02.designPattern.adapter;

public class Cleaner implements Electronic220v{

    @Override
    public void connect() {
        System.out.println("청소기 220v on");
    }
}
