package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class RussianAlphabet implements Alphabet{
    public Map<Character, Integer> getLetterScores(){
        return new HashMap<>(){{
            put('а', 1);
            put('б', 2);
            put('в', 8);
            put('г', 2);
            put('д', 1);
            put('е', 4);
            put('ё', 3);
            put('ж', 3);
            put('з', 1);
            put('и', 1);
            put('й', 3);
            put('к', 3);
            put('л', 1);
            put('м', 1);
            put('н', 1);
            put('о', 1);
            put('п', 3);
            put('р', 10);
            put('с', 1);
            put('т', 1);
            put('у', 1);
            put('ф', 1);
            put('х', 4);
            put('ц', 10);
            put('ч', 10);
            put('ш', 5);
            put('щ', 10);
            put('ъ', 10);
            put('ы', 5);
            put('ь', 2);
            put('э', 5);
            put('ю', 10);
            put('я', 10);
        }};
    }
}
