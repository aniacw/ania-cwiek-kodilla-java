package com.kodilla.testing.calculator;

public class Calculator {

    private String deviceName;
    private int a;
    private int b;

    public Calculator(String deviceName){
        this.deviceName = deviceName;
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
