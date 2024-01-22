package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.MalformedParameterizedTypeException;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Alphabet english = new English();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Alphabet english = new English();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Alphabet english = new English();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Alphabet english = new English();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Alphabet english = new English();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Alphabet english = new English();
        Scrabble scrabble = new Scrabble(english);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreNorwegian23() {
        Alphabet norwegian = new Norwegian();
        Scrabble scrabble = new Scrabble(norwegian);

        Assertions.assertEquals(23, scrabble.score("hærverk"));
    }

    @Test
    public void shouldScoreNorwegian8() {
        Alphabet norwegian = new Norwegian();
        Scrabble scrabble = new Scrabble(norwegian);

        Assertions.assertEquals(8, scrabble.score("ørret"));
    }

    @Test
    public void shouldScoreRussian3() {
        Alphabet russian = new Russian();
        Scrabble scrabble = new Scrabble(russian);

        Assertions.assertEquals(3,scrabble.score("да"));
    }
}
