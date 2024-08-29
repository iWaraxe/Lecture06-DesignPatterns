package com.coherentsolutions.advanced.java.creational.builder.ex01;

// Concrete builder for a wooden house
public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
