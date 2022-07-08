package com.example.jinung.part3.ch02.designPattern.adapter;

public class HairDryer implements Electronic110v{

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
