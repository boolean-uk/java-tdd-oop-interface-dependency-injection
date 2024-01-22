package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Language language = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Language language = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Language language = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Language language = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Language language = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Language language = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Language language = new RussianAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Language language = new GreekAlphabet();
        Scrabble scrabble = new Scrabble(language);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
