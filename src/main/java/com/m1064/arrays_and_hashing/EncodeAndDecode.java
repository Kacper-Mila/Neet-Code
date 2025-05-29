package com.m1064.arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public static String encode(List<String> strs) {
        if (strs == null || strs.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return result;
    }
}
