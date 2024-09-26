package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;

    public Scrabble() {
        Alphabet englishAlphabet = new EnglishAlphabet();
        Alphabet russianAlphabet = new RussianAlphabet();
        Alphabet greekAlphabet = new GreekAlphabet();
        this.letterScores = englishAlphabet.getLetterScores();
        this.letterScores.putAll(russianAlphabet.getLetterScores());
        this.letterScores.putAll(greekAlphabet.getLetterScores());
    }

    public int score(String word) {     //Do not change this method
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
