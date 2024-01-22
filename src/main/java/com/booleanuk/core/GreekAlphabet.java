package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class GreekAlphabet implements LetterScoreProvider {
    @Override
    public Map<Character, Integer> getLetterScores() {
        return new HashMap<>() {{
            put('α', 1);
            put('β', 4);
            put('γ', 3);
        }};
    }
}
