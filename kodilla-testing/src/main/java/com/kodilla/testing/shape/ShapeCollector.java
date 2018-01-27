package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape circle){
        figures.add(circle);
    }

    public Shape removeFigure(Shape shape){
        return null;
    }

    public Shape getFigure(int n){
        return null;
    }

    public Shape showFigures(){
        return null;
    }

    public int getShapesQuantity(){
        return figures.size();
    }

}
