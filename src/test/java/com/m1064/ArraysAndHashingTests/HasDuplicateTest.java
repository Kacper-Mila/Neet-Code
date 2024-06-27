package com.m1064.ArraysAndHashingTests;

import com.m1064.ArraysAndHashing;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HasDuplicateTest {

    @Test
    public void hasDuplicateShouldReturnTrue() {
        //given
        List<int[]> listOfContaining = List.of(
                new int[]{1, 2, 3, 3},
                new int[]{1,8,4,3,7,6,3}
        );

        //Then
        listOfContaining.forEach(intArr -> {
            assertTrue(ArraysAndHashing.hasDuplicate(intArr));
        });
    }

    @Test
    public void hasDuplicateShouldReturnFalse() {
        List<int[]> listOfNotContaining = List.of(
                new int[]{1, 2, 3, 4},
                new int[]{1,8,4,3,7,6,9}
        );

        listOfNotContaining.forEach(intArr -> {
            assertFalse(ArraysAndHashing.hasDuplicate(intArr));
        });
    }
}
