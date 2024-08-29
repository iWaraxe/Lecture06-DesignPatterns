package com.coherentsolutions.advanced.java.creational.builder.ex01;

// Concrete builder for a stone house
public class StoneHouseBuilder implements HouseBuilder {
    private House house;

    public StoneHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Stone foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Stone structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Stone roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Stone interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}