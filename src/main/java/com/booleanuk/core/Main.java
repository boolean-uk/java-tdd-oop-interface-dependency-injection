package com.booleanuk.core;

public class Main {
    public static void main(String[] args) {
        Alphabet englishAlphabet = new EnglishAlphabet();
        Alphabet greekAlphabet = new GreekAlphabet();
        Alphabet russianAlphabet = new RussianAlphabet();

        Scrabble s = new Scrabble(russianAlphabet);

        System.out.println(s.score("hello"));
        System.out.println(s.score("шшш"));
    }
}
