
package com.booleanuk.core;

import java.util.Map;

public interface LetterScoreProvider {
    Map<Character, Integer> getLetterScores();
}