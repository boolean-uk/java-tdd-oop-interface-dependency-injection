package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Greek implements Alphabet{
    @Override
    public Map<Character, Integer> getLetterScores() {
        return new HashMap<>(){{
            put('α', 1);
            put('β', 2);
            put('γ', 3);
            put('δ', 2);
            put('ε', 1);
            put('ζ', 4);
            put('η', 3);
            put('θ', 5);
            put('ι', 1);
            put('κ', 4);
            put('λ', 4);
            put('μ', 8);
            put('ν', 3);
            put('ξ', 1);
            put('ο', 1);
            put('π', 2);
            put('ρ', 4);
            put('σ', 8);
            put('τ', 3);
            put('υ', 10);
            put('φ', 1);
            put('χ', 5);
            put('ψ', 4);
            put('ω', 10);
        }};
    }
}
