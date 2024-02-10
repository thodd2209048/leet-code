package org.example.currentWeek._647PalindromicSubstrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int countSubstrings(String s) {
        int count = s.length();
        char[] chars = s.toCharArray();
        Map<Character, List<Integer>> characterListMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            characterListMap.computeIfAbsent(chars[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> list : characterListMap.values()
        ) {
            if(list.size() <= 1) continue;
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (isContiguous(chars, list.get(i), list.get(j))) count++;
                }
            }
        }
        return count;
    }

    public static boolean isContiguous(char[] chars, int s, int e) {
        while (s < e) {
            if (chars[s] != chars[e]) return false;
            s++;
            e--;
        }
        return true;
    }


//    public static int countSubstrings(String s) {
//        int count = s.length();
//        int length = 2;
//        StringBuilder sb = new StringBuilder();
//        while (length <= s.length()) {
//            for (int i = 0; i < s.length() + 1 - length; i++) {
//                String subString = s.substring(i, i + length);
//                sb.setLength(0);
//                sb.append(subString);
//                sb.reverse();
//                if (subString.contentEquals(sb)) count++;
//            }
//            length++;
//        }
//        return count;
//    }
}
