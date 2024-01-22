package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> englishLetterScores;
    Map<Character, Integer> russianLetterScores;
    Map<Character, Integer> greekLetterScores;

    public Scrabble() {
        Alphabet englishAlphabet = new EnglishAlphabet();
        Alphabet russianAlphabet = new RussianAlphabet();
        Alphabet greekAlphabet = new GreekAlphabet();
        this.englishLetterScores = englishAlphabet.getLetterScores();
        this.russianLetterScores = russianAlphabet.getLetterScores();
        this.greekLetterScores = greekAlphabet.getLetterScores();
    }

    public int englishScore(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.englishLetterScores.containsKey(ch)) {
                int score = this.englishLetterScores.get(ch);
                total += score;
            }
        }

        return total;
    }

    public int russianScore(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.russianLetterScores.containsKey(ch)) {
                int score = this.russianLetterScores.get(ch);
                total += score;
            }
        }

        return total;
    }

    public int greekScore(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.greekLetterScores.containsKey(ch)) {
                int score = this.greekLetterScores.get(ch);
                total += score;
            }
        }

        return total;
    }
}
