package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;
    GeneralAlphabet general;

    public Scrabble(GeneralAlphabet a) {
        this.general = a;
        this.letterScores = a.getLetterScores();
    }

    public int score(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.letterScores.containsKey(ch)) {
                int score = this.letterScores.get(ch);
                total += score;
            }
        }

        return total;
    }
}
