package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class NorwegianAlphabet implements Alphabet {
    public Map<Character, Integer> getLetterScores() {
        return new HashMap<>(){{
            put('a', 1);
            put('b', 3);
            put('c', 10);
            put('d', 2);
            put('e', 1);
            put('f', 4);
            put('g', 2);
            put('h', 4);
            put('i', 1);
            put('j', 4);
            put('k', 5);
            put('l', 1);
            put('m', 3);
            put('n', 1);
            put('o', 1);
            put('p', 3);
            put('q', 10);
            put('r', 1);
            put('s', 1);
            put('t', 1);
            put('u', 1);
            put('v', 4);
            put('w', 9);
            put('x', 8);
            put('y', 7);
            put('z', 10);
//            put('æ', 5);
//            put('ø', 4);
//            put('å', 5);
        }};
    }
}
