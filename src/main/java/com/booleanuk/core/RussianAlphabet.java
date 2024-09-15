package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class RussianAlphabet implements Alphabet{
    public Map<Character, Integer> getLetterScores() {
        return new HashMap<>() {{
            put('а', 1);
            put('б', 3);
            put('в', 3);
            put('г', 2);
            put('д', 1);
            put('е', 4);
            put('ё', 4);
            put('ж', 2);
            put('з', 2);
            put('и', 1);
            put('й', 1);
            put('к', 3);
            put('л', 1);
            put('м', 3);
            put('н', 1);
            put('о', 1);
            put('п', 3);
            put('р', 1);
            put('с', 1);
            put('т', 1);
            put('у', 1);
            put('ф', 4);
            put('х', 5);
            put('ц', 5);
            put('ч', 5);
            put('ш', 5);
            put('щ', 8);
            put('ъ', 8);
            put('ы', 8);
            put('ь', 10);
            put('э', 10);
            put('ю', 10);
        }};
    }
}
