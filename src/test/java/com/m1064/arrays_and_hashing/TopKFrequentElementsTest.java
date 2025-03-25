package com.m1064.arrays_and_hashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopKFrequentElementsTest {
    @Test
    public void shouldReturnTopKFrequentElements() {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] result = topKFrequentElements.topKFrequent(nums, k);

        // Don't care about the order of the elements
        Set<Integer> expected = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> actual = new HashSet<>();
        for (int num : result) {
            actual.add(num);
        }
        assertEquals(expected, actual);
    }
}
