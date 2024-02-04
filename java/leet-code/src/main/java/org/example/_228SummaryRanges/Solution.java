package org.example._228SummaryRanges;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/description/
public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        if (nums.length == 1) return List.of(String.valueOf(nums[0]));

        List<String> result = new ArrayList<>();
        int[] subArray = new int[2];
        subArray[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length - 1 && nums[i+1] == nums[i] + 1) continue;
            subArray[1] = nums[i];
            if (subArray[0] == subArray[1]) {
                result.add(String.valueOf(subArray[0]));
            } else {
                StringBuilder sb = new StringBuilder();
                result.add(sb.append(subArray[0]).append("->").append(subArray[1]).toString());
            }
            if(i == nums.length - 1) break;
            subArray[0] = nums[i+1];
        }
        return result;
    }
}
