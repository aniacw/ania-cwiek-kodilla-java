package com.kodilla.testing.calculator;

public class Calculator {

    private String deviceName;
    private int a;
    private int b;

    public Calculator(String deviceName, int a, int b){
        this.deviceName = deviceName;
        this.a = a;
        this.b = b;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
}
