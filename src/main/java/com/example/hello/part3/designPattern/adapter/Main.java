package com.example.hello.part3.designPattern.adapter;

public class Main {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110v adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110v airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    public static void connect(Electronic110v electronic110v) {
        electronic110v.powerOn();
    }
}
