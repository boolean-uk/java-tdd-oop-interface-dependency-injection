package com.booleanuk.core;

public class Main {

    public static void main(String[] arg){
        Alphabet alphabetEng = new EnglishAlphabet();
        Scrabble scrabbleEng = new Scrabble(alphabetEng);

        Alphabet alphabetRuss = new RussianAlphabet();
        Scrabble scrabbleRuss = new Scrabble(alphabetRuss);

        System.out.println(scrabbleEng.score("hello"));
        System.out.println(scrabbleRuss.score("дврфъ"));

    }





}
