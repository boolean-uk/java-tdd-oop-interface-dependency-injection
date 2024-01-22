package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    private final Map<Character, Integer> letterScores;

    public Scrabble(LetterScoreProvider provider) {
        this.letterScores = provider.getLetterScores();
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
