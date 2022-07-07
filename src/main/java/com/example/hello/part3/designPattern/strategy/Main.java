package com.example.hello.part3.designPattern.strategy;

public class Main {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println("base64Result = " + base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println("normalResult = " + normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println("appendResult = " + appendResult);


    }

}
