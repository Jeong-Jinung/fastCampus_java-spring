package com.example.jinung.part3.ch05.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new Base64Encoder()); // DI 필요한 객체를 외부에서 주입해준다.
        String result = encoder.encode(url);
        System.out.println(result);

    }
}
