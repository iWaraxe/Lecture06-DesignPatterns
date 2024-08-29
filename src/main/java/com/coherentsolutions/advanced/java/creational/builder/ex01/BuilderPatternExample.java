package com.coherentsolutions.advanced.java.creational.builder.ex01;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Create a builder for a wooden house
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        CivilEngineer engineer1 = new CivilEngineer(woodenHouseBuilder);

        // Construct a wooden house
        House woodenHouse = engineer1.constructHouse();
        System.out.println("Wooden House constructed: " + woodenHouse);

        // Create a builder for a stone house
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        CivilEngineer engineer2 = new CivilEngineer(stoneHouseBuilder);

        // Construct a stone house
        House stoneHouse = engineer2.constructHouse();
        System.out.println("Stone House constructed: " + stoneHouse);
    }
}
