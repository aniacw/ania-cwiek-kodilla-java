package com.kodilla.stream.world;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldTestSuite {

    @Before
    public void beforeTest(){
        System.out.println("Testing 7.4 World");
    }

    @After
    public void afterTest(){
        System.out.println("Test completed");
    }/*

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("Brasil");
        Country country2 = new Country("Japan");
        Country country3 = new Country("Peru");
        Country country4 = new Country("China");
        Country country5 = new Country("Taiwan");
        Country country6 = new Country("Argentina");
        List<Country> southAmerica = new ArrayList<>();
        southAmerica.add(country1);
        southAmerica.add(country3);
        southAmerica.add(country6);
        List<Country> asia = new ArrayList<>();
        asia.add(country2);
        asia.add(country4);
        asia.add(country5);
        List<Continent> theWorld = new ArrayList<>();
        World world = new World();
        theWorld.addAll(southAmerica);
        theWorld.addAll(asia);

        //When
        world.getPeopleQuantity();

        //Then

    }*/
}
