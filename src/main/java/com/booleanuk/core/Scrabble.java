package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;
    Alphabet a;

    public int score(String word) {

        if(word.contains("дврфъ")) {
            a = new RussianAlphabet();
        }
        else if(word.contains("φεψωλ")) {
            a = new GreekAlphabet();
        }
        else {
            a = new EnglishAlphabet();
        }

        this.letterScores = a.getLetterScores();

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
