package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Alphabet english = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Alphabet english = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Alphabet english = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Alphabet english = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Alphabet english = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Alphabet english = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(22, scrabble.score("quirky"));

    }

    @Test
    public void shouldScoreRussianLetters() {
        Alphabet russian = new RussianAlphabet();
        Scrabble scrabble = new Scrabble(russian);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Alphabet greek = new GreekAlphabet();
        Scrabble scrabble = new Scrabble(greek);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
