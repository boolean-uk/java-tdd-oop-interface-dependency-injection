package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;

    public Scrabble() {
        Alphabet a = new Greek();
        Alphabet b = new English();
        Alphabet c = new Russian();
        this.letterScores = a.getLetterScores();
        this.letterScores.putAll(b.getLetterScores());
        this.letterScores.putAll(c.getLetterScores());
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
