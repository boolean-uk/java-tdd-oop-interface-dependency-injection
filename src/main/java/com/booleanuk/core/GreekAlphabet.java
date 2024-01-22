package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class GreekAlphabet implements LanguageAlphabet {
    @Override
    public Map<Character, Integer> getLetterScores() {
        Map<Character, Integer> letterScores = new HashMap<>();
        // Greek letter-score mappings
        letterScores.put('α', 1);
        letterScores.put('ε', 1);
        letterScores.put('ι', 1);
        letterScores.put('ο', 1);
        letterScores.put('φ', 1);
        letterScores.put('ξ', 1);

        letterScores.put('β', 2);
        letterScores.put('δ', 2);
        letterScores.put('π', 2);

        letterScores.put('γ', 3);
        letterScores.put('η', 3);
        letterScores.put('ν', 3);
        letterScores.put('τ', 3);

        letterScores.put('ζ', 4);
        letterScores.put('κ', 4);
        letterScores.put('ρ', 4);
        letterScores.put('ψ', 4);
        letterScores.put('λ', 4);

        letterScores.put('θ', 5);
        letterScores.put('χ', 5);

        letterScores.put('μ', 8);
        letterScores.put('σ', 8);

        letterScores.put('υ', 10);
        letterScores.put('ω', 10);

        return letterScores;
    }
}
