package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;

    public Country(final String countryName) {
        this.countryName = countryName;
    }

    public static BigDecimal getPeopleQuantity(Country country){
        BigDecimal peopleQuantity = new BigDecimal("8468498");
        return peopleQuantity;
    }

}
