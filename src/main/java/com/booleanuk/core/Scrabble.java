package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;
    public Scrabble() {
        Alphabet english = new English();
        Alphabet greek = new Greek();
        Alphabet russian = new Russian();
        this.letterScores = english.getLetterScores();
        this.letterScores.putAll(greek.getLetterScores());
        this.letterScores.putAll(russian.getLetterScores());
        System.out.println(letterScores.toString());
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
