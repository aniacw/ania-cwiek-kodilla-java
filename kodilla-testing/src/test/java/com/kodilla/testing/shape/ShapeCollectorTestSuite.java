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



}
