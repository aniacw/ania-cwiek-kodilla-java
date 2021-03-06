package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        Random generator = new Random();
        int[] numbers = new int[20];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i;
        }

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.5, result, 0.1);
    }
}
