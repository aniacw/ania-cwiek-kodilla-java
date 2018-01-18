package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private double field;

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName(){
        //
        return null;
    }

    public double getField(){
        //
        return 100.0;
    }
}
