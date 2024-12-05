package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class ScrabbleTest {

    Alphabet a = new EnglishAlphabet();
    Alphabet r = new RussianAlphabet();

    Alphabet g = new GreekAlphabet();
    @Test
    public void shouldGive0ForEmptyWords() {
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Scrabble scrabble = new Scrabble(r);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Scrabble scrabble = new Scrabble(g);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
