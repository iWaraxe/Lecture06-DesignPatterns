package com.coherentsolutions.advanced.java.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Glyph c1 = factory.getCharacter('A', "Arial");
        Glyph c2 = factory.getCharacter('B', "Arial");
        Glyph c3 = factory.getCharacter('A', "Arial");

        c1.draw(10, 20);
        c2.draw(30, 20);
        c3.draw(50, 20);

        // The same instance of 'A' in 'Arial' is reused.
        System.out.println("c1 == c3: " + (c1 == c3));
    }
}
