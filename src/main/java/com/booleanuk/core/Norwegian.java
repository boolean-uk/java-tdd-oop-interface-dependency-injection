package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Norwegian implements Alphabet{
    public Map<Character, Integer> getLetterScore() {
        return new HashMap<>(){{
            put('a', 1);
            put('b', 4);
            put('c', 10);
            put('d', 1);
            put('e', 1);
            put('f', 2);
            put('g', 2);
            put('h', 3);
            put('i', 1);
            put('j', 4);
            put('k', 2);
            put('l', 1);
            put('m', 2);
            put('n', 1);
            put('o', 2);
            put('p', 4);
            put('q', 10);
            put('r', 1);
            put('s', 1);
            put('t', 1);
            put('u', 4);
            put('v', 5);
            put('w', 10);
            put('x', 8);
            put('y', 4);
            put('z', 10);
            put('æ',10);
            put('ø', 4);
            put('å', 4);
        }};
    }
}
