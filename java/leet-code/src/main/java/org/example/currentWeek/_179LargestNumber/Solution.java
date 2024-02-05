package org.example.currentWeek._179LargestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/largest-number/description/
public class Solution {
    public static String largestNumber(int[] nums) {
        List<String> numsString = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numsString.add(String.valueOf(nums[i]));
        }
        numsString.sort(new SortByFirstCharacter());
        Collections.reverse(numsString);
        StringBuilder sb = new StringBuilder();
        if (numsString.get(0).equals("0")) return "0";
        for (String s : numsString
        ) {
            sb.append(s);
        }

        return sb.toString();
    }

}

class SortByFirstCharacter implements Comparator<String> {
    public int compare(String s1, String s2) {
        return String.CASE_INSENSITIVE_ORDER.compare(s1 + s2, s2 + s1);
    }
}
