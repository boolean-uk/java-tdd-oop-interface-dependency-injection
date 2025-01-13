package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(0, scrabble.scoreEnglish(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(0, scrabble.scoreEnglish("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(1, scrabble.scoreEnglish("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(4, scrabble.scoreEnglish("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(6, scrabble.scoreEnglish("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(22, scrabble.scoreEnglish("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(18, scrabble.scoreRussian("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Scrabble scrabble = new Scrabble();
        Assertions.assertEquals(20, scrabble.scoreGreek("φεψωλ"));
    }
}
