package org.example.longTimeAgo._451SortCharactersByFrequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/sort-characters-by-frequency/description/
public class Solution {
    public static String frequencySort(String s) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            characterCountMap.putIfAbsent(aChar, 0);
            characterCountMap.computeIfPresent(aChar, (key, value) -> value + 1);
        }

        StringBuilder sb = new StringBuilder();
        characterCountMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(e -> {
                    char[] chars1 = new char[e.getValue()];
                    Arrays.fill(chars1, e.getKey());
                    sb.append(new String(chars1));
                });

        return sb.toString();
    }
}