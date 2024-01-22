// -*- coding: utf-8 -*-
package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class NorwegianAlphabet implements Alphabet {
    public Map<Character, Integer> getLetterScores(){
        return new HashMap<>(){{
            put('a', 1);
            put('b', 2);
            put('c', 8);
            put('d', 2);
            put('e', 1);
            put('f', 4);
            put('g', 2);
            put('h', 2);
            put('i', 1);
            put('j', 3);
            put('k', 3);
            put('l', 1);
            put('m', 1);
            put('n', 1);
            put('o', 1);
            put('p', 3);
            put('q', 10);
            put('r', 1);
            put('s', 1);
            put('t', 1);
            put('u', 1);
            put('v', 4);
            put('w', 10);
            put('x', 10);
            put('y', 5);
            put('z', 10);
            put('æ', 5);
            put('ø', 3);
            put('å', 2);
            /*
            put('\u00E6', 5);
            put('\u00F8', 3);
            put('\u00E5', 2);

             */

        }};
    }
}
