package com.m1064.arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    /** 
     * <p>Given an integer array nums and an integer k, return the k most frequent elements within the array.</p>
     * <pre>
     *     <b>Example</b>
     *     Input: nums = [1,2,2,3,3,3], k = 2
     *     Output: [2,3]
     * </pre>
     * @param nums integer array of integers to find the most frequent elements
     * @param k integer of most frequent elements to return
     * @return integer array of the k most frequent elements
     **/
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }

        return res;
    }
}
