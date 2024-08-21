package com.booleanuk.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GreekAlphabet implements Alphabet{
	public Map<Character, Integer> getLetterScores() {
		HashMap<Character, Integer> greekAlphabet = new HashMap<>();
		try{
			File f = new File("GREEK_LETTER_SCORES.md");
			Scanner sc = new Scanner(f);
			sc.nextLine(); sc.nextLine();
			while (sc.hasNext()){
				String line = sc.nextLine();
				char splitChar = line.charAt(0);
				line = line.substring(1, line.length()-1).replaceAll("\\s", "");
				int splitindex = line.indexOf(splitChar);
				String validLettersCommaSeperated  = line.substring(0, splitindex);
				String valueStr = line.substring(splitindex+1, line.length());

				String[] letters = validLettersCommaSeperated.split(",");
				int value = Integer.valueOf(valueStr);

				for(String str: letters){
					greekAlphabet.put(str.charAt(0), value);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(greekAlphabet);
		return greekAlphabet;
	}
}
