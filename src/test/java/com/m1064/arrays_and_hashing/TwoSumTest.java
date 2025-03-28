package com.m1064.arrays_and_hashing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        HashMap<Integer, int[]> mapOfTargetAndArray = new HashMap<>();
        mapOfTargetAndArray.put(7, new int[]{3, 4, 5, 6});
        mapOfTargetAndArray.put(11, new int[]{2, 11, 5, 6});
        mapOfTargetAndArray.put(10, new int[]{5, 5});
        mapOfTargetAndArray.put(5, new int[]{0, 0, 2, 3});

        List<int[]> listOfCorrect = List.of(
                new int[]{2, 3},
                new int[]{0, 1},
                new int[]{0, 1},
                new int[]{2, 3}
        );

        AtomicInteger listIndex = new AtomicInteger();
        mapOfTargetAndArray.forEach((key, value) -> {
            assertArrayEquals(
                    listOfCorrect.get(listIndex.get()),
                    TwoSum.twoSum(mapOfTargetAndArray.get(key), key)
            );
            listIndex.getAndIncrement();
        });
    }
}
