package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Alphabet alphabet = new English();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Alphabet alphabet = new English();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Alphabet alphabet = new English();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Alphabet alphabet = new English();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Alphabet alphabet = new English();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Alphabet alphabet = new English();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Alphabet alphabet = new Russian();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Alphabet alphabet = new Greek();
        Scrabble scrabble = new Scrabble(alphabet);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
