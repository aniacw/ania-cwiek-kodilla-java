package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.contains;

public class ShapeCollectorTestSuite{

    private static int testCounter = 0;

    @Before
    public void beforeTests(){
        testCounter++;
        System.out.println("ShapeCollector test no: " + testCounter);
    }

    @After
    public void afterTest(){
        System.out.println("End of test no: " + testCounter);
    }

    @Test
    public void testGetShapeName(){
        //Given
        Square square = new Square("square1", 20);

        //When
        String result = square.getShapeName();

        //Then
        Assert.assertEquals("square1", result);
    }

    @Test
    public void testGetField(){
        //Given
        Square square = new Square("square1", 20.0);

        //When
        double result = square.getField();

        //Then
        Assert.assertEquals(20.0, result, 0.001);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("myCircle1", 30);

        //When
        shapeCollector.addFigure(circle1);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square("mySquare1", 45);
        shapeCollector.addFigure(square1);

        //When
        shapeCollector.removeFigure(square1);

        //Then
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle("myTriangle1", 43);
        Triangle triangle2 = new Triangle("myTriangle2", 57.4);
        Square square3 = new Square("mySquare3", 74.5);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(square3);

        //When
        Shape result = shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(square3, result);
    }
}
