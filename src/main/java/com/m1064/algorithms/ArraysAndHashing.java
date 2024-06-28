package com.m1064.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraysAndHashing {

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

    /**
     * <p>Given two strings s and t, return {@code true} if the two strings are anagrams of each other, otherwise return false.</p>
     * <pre>
     * <b>Example</b>
     * Input: s = "racecar", t = "carrace"
     * Output: true
     * </pre>
     * @param s string
     * @param t string
     * @return {@code true} if two string are anagrams
     */
    public static boolean isAnagram(String s, String t) {
        char[] sAsArray = s.toCharArray();
        Arrays.sort(sAsArray);
        char[] tAsArray = t.toCharArray();
        Arrays.sort(tAsArray);

        return Arrays.equals(sAsArray, tAsArray);
    }

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

    /**
     * <p>Given an array of strings strs, group the anagrams together.</p>
     * <pre>
     *     <b>Example</b>
     *     Input: strs = ["eat","tea","tan","ate","nat","bat"]
     *     Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * </pre>
     * @param strs array of strings
     * @return {@code List<List<String>>}
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        //TODO Write Test and implementation

        return null;
    }
}
