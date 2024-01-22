package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Alphabet englishalphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishalphabet);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Alphabet englishalphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishalphabet);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Alphabet englishalphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishalphabet);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Alphabet englishalphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishalphabet);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Alphabet englishalphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishalphabet);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Alphabet englishalphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(englishalphabet);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Alphabet russianAlphabet = new RussianAlphabet();
        Scrabble scrabble = new Scrabble(russianAlphabet);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Alphabet greekAlphabet = new GreekAlphabet();
        Scrabble scrabble = new Scrabble(greekAlphabet);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
