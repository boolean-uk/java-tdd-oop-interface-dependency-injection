package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public interface Alphabet {
	public Map<Character, Integer> getLetterScores();
}

class EnglishAlphabet implements Alphabet {
	public Map<Character, Integer> getLetterScores() {
		return new HashMap<>() {
			{
				put('a', 1);
				put('b', 3);
				put('c', 3);
				put('d', 2);
				put('e', 1);
				put('f', 4);
				put('g', 2);
				put('h', 4);
				put('i', 1);
				put('j', 8);
				put('k', 5);
				put('l', 1);
				put('m', 3);
				put('n', 1);
				put('o', 1);
				put('p', 3);
				put('q', 10);
				put('r', 1);
				put('s', 1);
				put('t', 1);
				put('u', 1);
				put('v', 4);
				put('w', 4);
				put('x', 8);
				put('y', 4);
				put('z', 10);
			}
		};
	}
}

class GreekAlphabet implements Alphabet {
	@Override
	public Map<Character, Integer> getLetterScores() {
		return new HashMap<>() {
			{
				put('α', 1);
				put('ε', 1);
				put('ι', 1);
				put('ο', 1);
				put('φ', 1);
				put('ξ', 1);
				put('β', 2);
				put('δ', 2);
				put('π', 2);
				put('γ', 3);
				put('η', 3);
				put('ν', 3);
				put('τ', 3);
				put('ζ', 4);
				put('κ', 4);
				put('ρ', 4);
				put('ψ', 4);
				put('λ', 4);
				put('θ', 5);
				put('χ', 5);
				put('μ', 8);
				put('σ', 8);
				put('υ', 10);
				put('ω', 10);

			}
		};
	}
}

class RussianAlphabet implements Alphabet {
	@Override
	public Map<Character, Integer> getLetterScores() {
		return new HashMap<>() {
			{
				put('а', 1);
				put('б', 1);
				put('в', 1);
				put('г', 1);
				put('д', 1);
				put('е', 2);
				put('ё', 2);
				put('ж', 2);
				put('з', 2);
				put('и', 2);
				put('й', 3);
				put('к', 3);
				put('л', 3);
				put('м', 3);
				put('н', 3);
				put('о', 4);
				put('п', 4);
				put('р', 4);
				put('с', 4);
				put('т', 4);
				put('у', 4);
				put('ф', 4);
				put('х', 5);
				put('ц', 5);
				put('ч', 5);
				put('ш', 5);
				put('щ', 8);
				put('ъ', 8);
				put('ы', 8);
				put('ь', 10);
				put('э', 10);
				put('ю', 10);

			}
		};
	}
}

