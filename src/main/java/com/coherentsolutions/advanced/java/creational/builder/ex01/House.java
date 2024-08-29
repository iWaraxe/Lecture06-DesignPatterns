package com.coherentsolutions.advanced.java.creational.builder.ex01;

// The complex object that we want to build
public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;


    // Setters and toString() method for displaying the house
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior + "]";
    }
}
