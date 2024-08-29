package com.coherentsolutions.advanced.java.creational.builder.ex01;

// Abstract builder interface defining the steps to build a house
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}
