package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;
    Map<Character, Integer> greekLetterScores;
    Map<Character, Integer> russianLetterScores;

    public Scrabble() {
        Alphabet english = new EnglishAlphabet();
        Alphabet greek = new GreekAlphabet();
        Alphabet russian = new RussianAlphabet();
        this.letterScores = english.getLetterScores();
        this.greekLetterScores = greek.getLetterScores();
        this.russianLetterScores = russian.getLetterScores();

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

    public int scoreGreek(String word) {
        int total = 0;


        for (char ch : word.toCharArray()) {
            if (this.greekLetterScores.containsKey(ch)) {
                int score = this.greekLetterScores.get(ch);
                total += score;
            }
        }

        return total;
    }

    public int scoreRussian(String word) {
        int total = 0;


        for (char ch : word.toCharArray()) {
            if (this.russianLetterScores.containsKey(ch)) {
                int score = this.russianLetterScores.get(ch);
                total += score;
            }
        }

        return total;
    }


}
