package org.example.longTimeAgo._2108FindFirstPalindromicStringintheArray;

public class Solution {
    public static String firstPalindrome(String[] words) {
        for (String word: words
             ) {
            if(isPalindrome(word)) return word;
        }
        return "";
    }

    public static boolean isPalindrome(String word){
        int s = 0;
        int e = word.length() - 1;
        while(s < e){
            if(word.charAt(s)!=word.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
