package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;


public class GreekAlphabet implements Alphabet{
    public Map<Character, Integer> getLetterScores() {


        return new HashMap<>() {{
            put('\u03B1', 1);
            put('\u03B5', 1);
            put('\u03B9', 1);
            put('\u03BF', 1);
            put('\u03C6', 1);
            put('\u03BE', 1);
            put('\u03B2', 2);
            put('\u03B4', 2);
            put('\u03C0', 2);
            put('\u03B3', 3);
            put('\u03B7', 3);
            put('\u03BD', 3);
            put('\u03C4', 3);
            put('\u03B6', 4);
            put('\u03BA', 4);
            put('\u03C1', 4);
            put('\u03C8', 4);
            put('\u03BB', 4);
            put('\u03B8', 5);
            put('\u03C7', 5);
            put('\u03BC', 8);
            put('v', 4);
            put('w', 4);
            put('x', 8);
            put('\u03C3', 8);
            put('\u03C5', 10);
            put('\u03C9', 10);
        }};
    }
}
