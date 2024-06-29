package com.m1064.arrays_and_hashing;

import java.util.Arrays;

public class IsAnagram {
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
}
