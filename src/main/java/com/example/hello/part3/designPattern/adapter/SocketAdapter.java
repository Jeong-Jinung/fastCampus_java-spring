package com.example.hello.part3.designPattern.adapter;

public class SocketAdapter implements Electronic110v{

    private Electronic220v electronic220v;

    public SocketAdapter(Electronic220v electronic220v) {
        this.electronic220v = electronic220v;
    }

    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}
