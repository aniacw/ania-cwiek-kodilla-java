package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final BigDecimal peopleQuantity;

    public World(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    private final List<Continent> theContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        theContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return theContinents.stream()
                .flatMap(continent -> continent.getTheCountries())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }

}
