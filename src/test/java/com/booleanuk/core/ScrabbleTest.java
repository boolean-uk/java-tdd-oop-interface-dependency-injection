package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrabbleTest {
    @Test
    public void shouldGive0ForEmptyWords() {
        Alphabet a = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(0, scrabble.score(""));

        Alphabet b = new RussianAlphabet();
        Scrabble scrabble2 = new Scrabble(b);
        Assertions.assertEquals(0, scrabble.score(""));

        Alphabet c = new GreekAlphabet();
        Scrabble scrabble3 = new Scrabble(c);
        Assertions.assertEquals(0, scrabble.score(""));
    }

    @Test
    public void shouldGive0ForWhiteSpace() {
        Alphabet a = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(0, scrabble.score("\n\r\t\b\f"));

        Alphabet b = new RussianAlphabet();
        Scrabble scrabble2 = new Scrabble(b);
        Assertions.assertEquals(0, scrabble2.score("\n\r\t\b\f"));

        Alphabet c = new GreekAlphabet();
        Scrabble scrabble3 = new Scrabble(c);
        Assertions.assertEquals(0, scrabble3.score("\n\r\t\b\f"));
    }

    @Test
    public void shouldScore1ForA() {
        Alphabet a = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(1, scrabble.score("a"));
    }

    @Test
    public void shouldScore4ForF() {
        Alphabet a = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(4, scrabble.score("f"));
    }

    @Test
    public void shouldScore6ForStreet() {
        Alphabet a = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(6, scrabble.score("street"));
    }

    @Test
    public void shouldScore22ForQuirky() {
        Alphabet a = new EnglishAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(22, scrabble.score("quirky"));
    }

    @Test
    public void shouldScoreRussianLetters() {
        Alphabet a = new RussianAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(18, scrabble.score("дврфъ"));
    }

    @Test
    public void shouldScoreGreekLetters() {
        Alphabet a = new GreekAlphabet();
        Scrabble scrabble = new Scrabble(a);
        Assertions.assertEquals(20, scrabble.score("φεψωλ"));
    }
}
