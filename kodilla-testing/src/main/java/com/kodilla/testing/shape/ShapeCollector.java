package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape circle){
        figures.add(circle);
    }

    public void removeFigure(Shape square){
        figures.remove(square);
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void showFigures(){
        System.out.println("The figures: "+figures);
    }

    public int getShapesQuantity(){
        return figures.size();
    }

}
