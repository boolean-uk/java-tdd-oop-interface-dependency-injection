package com.booleanuk.core;

import java.util.HashMap;

public class GreekAlphabet implements Alphabet{
    public HashMap<Character,Integer> getLetterScores() {
        return new HashMap<>(){{
            put('α',1);
        }};
    }

}
