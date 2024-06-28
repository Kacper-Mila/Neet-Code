package com.m1064.ArraysAndHashingTests;

import com.m1064.algorithms.ArraysAndHashing;
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

        listOfCorrect.forEach(anagramList -> assertTrue(ArraysAndHashing.isAnagram(anagramList.getFirst(), anagramList.getLast())));
    }

    @Test
    public void shouldReturnFalse() {
        List<List<String>> listOfCorrect = List.of(
                List.of("jar", "jam"),
                List.of("patelnia", "patelnio")
        );

        listOfCorrect.forEach(anagramList -> assertFalse(ArraysAndHashing.isAnagram(anagramList.getFirst(), anagramList.getLast())));
    }
}
