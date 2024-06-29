package com.m1064.arrays_and_hashing;

import java.util.HashMap;

public class HasDuplicate {
    /**
     * <p>Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.</p>
     * <pre>
     * <b>Example</b>
     * Input: nums = [1, 2, 3, 3]
     * Output: true
     * </pre>
     * @param numsArr array of Integers
     * @return {@code true} if {@code numsArr} contains duplicates
     */
    public static boolean hasDuplicate(int[] numsArr) {
        HashMap<Integer, Integer> filter = new HashMap<>();

        for (int num : numsArr) {
            if (filter.containsKey(num)){
                return true;
            }
            filter.put(num, 1);
        }

        return false;
    }
}
