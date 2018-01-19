package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.collection.OddNumbersExterminator;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminatorTest {

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //when
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);

        //then
        Assert.assertEquals(resultList, emptyList);
        //Assert.assertTrue(resultList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list = Arrays.asList(2,3,6,8,10);

        //when
        List<Integer> resultList = oddNumbersExterminator.exterminate(list);

        //then
        Assert.assertThat(resultList, contains(2,6,8,10));
        Assert.assertTrue(resultList.size()<=4);
    }

    @Test
    public void testOddNumbersExterminatorNormalList2() {
        //give
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(50);
        newList.add(45);
        newList.add(7);
        newList.add(3);
        newList.add(24);
        newList.add(85);

        //when
        List<Integer> resultList = oddNumbersExterminator.exterminate(newList);

        //then
        Assert.assertEquals(50, resultList);
    }
}
