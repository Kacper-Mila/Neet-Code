package com.m1064.arrays_and_hashing;

import java.util.HashMap;

public class TwoSum {
    /**
     * <p>Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.</p>
     * <p>You may assume that every input has exactly one pair of indices i and j that satisfy the condition.</p>
     * <p>Returns the answer with the smaller index first.</p>
     * <pre>
     *     <b>Example</b>
     *     Input: nums = [3,4,5,6], target = 7
     *     Output: [0,1]
     * </pre>
     * @param nums arrays of number to be searched in
     * @param target number to witch {@code Integers} from {@code nums} should sum to
     * @return int[] - pair of indexes from {@code nums}
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tmpMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int subDiff = target - nums[i];
            if (tmpMap.containsKey(subDiff)) {
                return new int[]{tmpMap.get(subDiff), i};
            }

            tmpMap.put(nums[i], i);
        }

        return null;
    }
}
