package com.coherentsolutions.advanced.java.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Glyph> characters = new HashMap<>();

    public Glyph getCharacter(char symbol, String font) {
        String key = symbol + "-" + font;
        Glyph character = characters.get(key);
        if (character == null) {
            character = new Character(symbol, font);
            characters.put(key, character);
        }
        return character;
    }
}
