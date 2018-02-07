package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Test
    public void testNumberOfPosts0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();
        List<String> userNamesFalse = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculator.getAvPostUser());
    }

    @Test
    public void testNumberOfPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, calculator.getAvPostUser());
    }

    @Test
    public void testNumberOfComments0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, calculator.getAvCommPost());
    }

    @Test
    public void testNumberOfCommentsHigherThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, calculator.getAvCommPost());
    }

    @Test
    public void testNumberOfCommentsLowerThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.5, calculator.getAvCommPost());
    }

    @Test
    public void testNumberOfUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculator.getAvCommUser());
    }

    @Test
    public void testNumberOfUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2.5, calculator.getAvCommUser());
    }
}
