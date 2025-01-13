package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;
    Alphabet english;
    Alphabet russian;
    Alphabet greek;

    public Scrabble() {
        letterScores = new HashMap<Character, Integer>();

        english = new EnglishAlphabet();
        this.addAlphabetToMap(english);

        russian = new RussianAlphabet();
        this.addAlphabetToMap(russian);

        greek = new GreekAlphabet();
        this.addAlphabetToMap(greek);
    }

    public void addAlphabetToMap(Alphabet a) {
        for(Character c : a.getLetterScores().keySet()) {
            this.letterScores.put(c, a.getLetterScores().get(c));
        }
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