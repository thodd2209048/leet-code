package org.example.longTimeAgo._1768MergeStringsAlternately;

//https://leetcode.com/problems/merge-strings-alternately/description/
class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int headSize = Math.min(word1.length(), word2.length());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < headSize; i++) {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }
        stringBuilder.append(word1.substring(headSize)).append(word2.substring(headSize));

        return stringBuilder.toString();
    }
}
