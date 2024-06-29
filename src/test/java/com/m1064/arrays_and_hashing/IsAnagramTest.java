package com.m1064.arrays_and_hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsAnagramTest {

    @Test
    public void shouldReturnTrue() {
        List<List<String>> listOfCorrect = List.of(
            List.of("racecar", "carrace"),
            List.of("katapulta", "pultakata")
        );

        listOfCorrect.forEach(anagramList -> assertTrue(IsAnagram.isAnagram(anagramList.get(0), anagramList.get(1))));
    }

    @Test
    public void shouldReturnFalse() {
        List<List<String>> listOfCorrect = List.of(
                List.of("jar", "jam"),
                List.of("patelnia", "patelnio")
        );

        listOfCorrect.forEach(anagramList -> assertFalse(IsAnagram.isAnagram(anagramList.get(0), anagramList.get(1))));
    }
}
