package com.booleanuk.core;

import java.util.Map;

import java.util.Map;

public class Scrabble {
    private final LanguageAlphabet languageAlphabet;

    public Scrabble(LanguageAlphabet languageAlphabet) {
        this.languageAlphabet = languageAlphabet;
    }

    public int score(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (languageAlphabet.getLetterScores().containsKey(ch)) {
                int score = languageAlphabet.getLetterScores().get(ch);
                total += score;
            }
        }

        return total;
    }
}

