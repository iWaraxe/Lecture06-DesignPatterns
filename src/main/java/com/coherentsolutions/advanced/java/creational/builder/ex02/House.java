package com.coherentsolutions.advanced.java.creational.builder.ex02;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    // Private constructor to prevent direct instantiation
    private House() {}

    // Getters for the fields
    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

    // Static inner Builder class
    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        // Setters that return the Builder instance for chaining
        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        // Build method that creates and returns the final House instance
        public House build() {
            House house = new House();
            house.foundation = this.foundation;
            house.structure = this.structure;
            house.roof = this.roof;
            house.interior = this.interior;
            return house;
        }
    }
}
