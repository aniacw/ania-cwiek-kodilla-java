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
        Assert.assertEquals(4, resultList.size());
    }

}
