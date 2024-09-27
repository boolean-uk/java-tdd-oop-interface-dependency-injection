package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Russian implements Alphabet {
    public Map<Character, Integer> getLetterScore() {
        return new HashMap<>(){{
            put('а', 1);
            put('б', 4);
            put('в', 8);
            put('г', 2);
            put('д', 2);
            put('е', 1);
            put('ё', 10);
            put('ж', 5);
            put('з', 5);
            put('и', 1);
            put('й', 4);
            put('к', 2);
            put('л', 3);
            put('м', 3);
            put('н', 1);
            put('о', 1);
            put('п', 4);
            put('р', 2);
            put('с', 2);
            put('т', 1);
            put('у', 3);
            put('ф', 8);
            put('х', 5);
            put('ц', 8);
            put('ч', 5);
            put('ш', 10);
            put('щ', 10);
            put('ъ', 10);
            put('ы', 4);
            put('ь', 3);
            put('э', 8);
            put('ю', 7);
            put('я', 5);
        }};
    }
}
