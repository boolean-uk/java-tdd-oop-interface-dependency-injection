package com.booleanuk.core;

public class Main {
    public static void main(String[] args) {
        Alphabet englishAlphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishAlphabet);


        System.out.println(scrabble.score("hei"));
    }
}
