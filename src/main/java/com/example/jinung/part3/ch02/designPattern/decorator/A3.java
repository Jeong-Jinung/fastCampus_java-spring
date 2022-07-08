package com.example.jinung.part3.ch02.designPattern.decorator;

public class A3 extends AudiDecorator{

    public A3(ICar audi, String modelName) {
        super(audi, modelName, 1000);
    }
}
