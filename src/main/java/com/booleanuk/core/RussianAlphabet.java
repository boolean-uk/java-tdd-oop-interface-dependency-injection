
package com.booleanuk.core;
import java.util.HashMap;
import java.util.Map;

    public class RussianAlphabet implements LanguageAlphabet {
        @Override
        public Map<Character, Integer> getLetterScores() {
            Map<Character, Integer> letterScores = new HashMap<>();
            // Russian letter-score mappings
            letterScores.put('а', 1);
            letterScores.put('б', 1);
            letterScores.put('в', 1);
            letterScores.put('г', 1);
            letterScores.put('д', 1);

            letterScores.put('е', 2);
            letterScores.put('ё', 2);
            letterScores.put('ж', 2);
            letterScores.put('з', 2);
            letterScores.put('и', 2);

            letterScores.put('й', 3);
            letterScores.put('к', 3);
            letterScores.put('л', 3);
            letterScores.put('м', 3);
            letterScores.put('н', 3);

            letterScores.put('о', 4);
            letterScores.put('п', 4);
            letterScores.put('р', 4);
            letterScores.put('с', 4);
            letterScores.put('т', 4);
            letterScores.put('у', 4);
            letterScores.put('ф', 4);

            letterScores.put('х', 5);
            letterScores.put('ц', 5);
            letterScores.put('ч', 5);
            letterScores.put('ш', 5);

            letterScores.put('щ', 8);
            letterScores.put('ъ', 8);
            letterScores.put('ы', 8);

            letterScores.put('ь', 10);
            letterScores.put('э', 10);
            letterScores.put('ю', 10);

            return letterScores;
        }
    }

