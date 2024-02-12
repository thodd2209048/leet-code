package org.example.longTimeAgo._387FirstUniqueCharacterinaString;

//https://leetcode.com/problems/first-unique-character-in-a-string
public class Solution {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        int[] index = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for (int i = 0; i < s.length(); i++) {
            int order = s.charAt(i) - 'a';
            count[order]++;
            if(count[order] == 1){
                index[order] = i;
            }
        }
        int indexOfFirstNonRepeating = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if(count[i] == 1 && index[i] < indexOfFirstNonRepeating){
                indexOfFirstNonRepeating = index[i];
            }
        }
        if (indexOfFirstNonRepeating == Integer.MAX_VALUE) return -1;
        return indexOfFirstNonRepeating;
    }
}
