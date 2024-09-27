package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        GeneralAlphabet alphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        GeneralAlphabet alphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        GeneralAlphabet alphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        GeneralAlphabet alphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        GeneralAlphabet alphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        GeneralAlphabet alphabet = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        GeneralAlphabet alphabet = new RussianAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        GeneralAlphabet alphabet = new GreekAlphabet();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
