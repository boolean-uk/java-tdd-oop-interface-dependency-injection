package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScoresEnglish;
    Map<Character, Integer> letterScoresGreek;
    Map<Character, Integer> letterScoresRussian;

    public Scrabble() {
        Alphabet a = new EnglishAlphabet();
        Alphabet greekAlphabet = new GreekAlphabet();
        Alphabet russianAlphabet = new RussianAlphabet();
        this.letterScoresEnglish = a.getLetterScores();
        this.letterScoresGreek = greekAlphabet.getLetterScores();
        this.letterScoresRussian = russianAlphabet.getLetterScores();
    }

    public int scoreEnglish(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.letterScoresEnglish.containsKey(ch)) {
                int score = this.letterScoresEnglish.get(ch);
                total += score;
            }
        }

        return total;
    }

    public int scoreGreek(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.letterScoresGreek.containsKey(ch)) {
                int score = this.letterScoresGreek.get(ch);
                total += score;
            }
        }

        return total;
    }

    public int scoreRussian(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.letterScoresRussian.containsKey(ch)) {
                int score = this.letterScoresRussian.get(ch);
                total += score;
            }
        }

        return total;
    }
}
