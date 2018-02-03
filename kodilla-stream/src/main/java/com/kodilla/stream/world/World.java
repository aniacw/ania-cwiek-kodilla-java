package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> theContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        theContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return theContinents.stream()
                .flatMap(continent -> continent.getTheCountries().stream())
                .map(Country:: getPeopleQuantity)  //czy metoda zawsze musi byc static?
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
