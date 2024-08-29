package com.coherentsolutions.advanced.java.creational.builder.ex02;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Using the Builder to create a House instance
        House house = new House.Builder()
                .setFoundation("Concrete foundation")
                .setStructure("Wooden structure")
                .setRoof("Asphalt shingle roof")
                .setInterior("Modern interior")
                .build();

        System.out.println("House built with the following details:");
        System.out.println("Foundation: " + house.getFoundation());
        System.out.println("Structure: " + house.getStructure());
        System.out.println("Roof: " + house.getRoof());
        System.out.println("Interior: " + house.getInterior());
    }
}
