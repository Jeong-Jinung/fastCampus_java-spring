package com.example.jinung.part3.ch02.designPattern.decorator;

public class A5 extends AudiDecorator{

    public A5(ICar audi, String modelName) {
        super(audi, modelName, 5000);
    }
}
