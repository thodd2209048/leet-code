package org.example.currentWeek._49GroupAnagrams;

import java.util.*;

//https://leetcode.com/problems/group-anagrams
public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs
             ) {
            String sortedStr = sortString(str);
            map.computeIfAbsent(sortedStr, k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private static String sortString(String str) {
        char[] charArrays = str.toCharArray();
        Arrays.sort(charArrays);
        return new String(charArrays);
    }
}

