package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class NorwegianAlphabet implements Alphabet {

    public Map<Character, Integer> getLetterScores() {
        return new HashMap<>() {{
            put('a', 1);
            put('d', 1);
            put('e', 1);
            put('i', 1);
            put('l', 1);
            put('n', 1);
            put('r', 1);
            put('s', 1);
            put('t', 1);
            put('f', 2);
            put('g', 2);
            put('k', 2);
            put('m', 2);
            put('o', 2);
            put('h', 3);
            put('b', 4);
            put('j', 4);
            put('p', 4);
            put('u', 4);
            put('v', 4);
            put('å', 4);
            put('ø', 5);
            put('y', 6);
            put('æ', 6);
            put('w', 8);
            put('c', 10);
        }};
    }
}
