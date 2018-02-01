package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    private final List<Country> theCountries = new ArrayList<>();

    public void addCountry(Country country){
        theCountries.add(country);
    }

    public List<Country> getTheCountries() {
        return theCountries;
    }
}
