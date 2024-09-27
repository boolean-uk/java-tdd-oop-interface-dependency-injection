package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;

    public Scrabble(Alphabet language) {
        this.letterScores = language.getLetterScore();
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

    public static void main(String[] args) {
        Alphabet nor = new Norwegian();
        Scrabble scrabble = new Scrabble(nor);

    }
}
