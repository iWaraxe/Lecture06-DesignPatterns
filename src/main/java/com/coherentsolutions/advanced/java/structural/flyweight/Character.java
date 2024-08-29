package com.coherentsolutions.advanced.java.structural.flyweight;

public class Character implements Glyph {
    private char symbol;  // Intrinsic state
    private String font;  // Intrinsic state

    public Character(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing character '" + symbol + "' in font " + font + " at position (" + x + ", " + y + ")");
    }
}

