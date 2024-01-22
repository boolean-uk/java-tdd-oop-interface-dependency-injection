package com.booleanuk.core;

import com.booleanuk.core.alphabets.Alphabet_UK;

public class Main {
    public static void main(String[] args) {
        String word = "Jabda"; // Score 7 in en-uk

        Alphabet en_uk = new Alphabet_UK();
        Scrabble scrabble = new Scrabble(en_uk);
        System.out.println(scrabble.score(word));
    }
}
