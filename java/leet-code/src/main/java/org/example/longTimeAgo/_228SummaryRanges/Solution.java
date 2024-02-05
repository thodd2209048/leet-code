package org.example.longTimeAgo._228SummaryRanges;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/description/
public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        if (nums.length == 1) return List.of(String.valueOf(nums[0]));

        List<String> result = new ArrayList<>();
        int start = nums[0];
        for (int i = 0; i < nums.length; i++) {
            while(i < nums.length - 1 && nums[i+1] == nums[i] + 1){
                i++;
            }
            if (start == nums[i]) {
                result.add(String.valueOf(start));
            } else {
                StringBuilder sb = new StringBuilder();
                result.add(sb.append(start).append("->").append(nums[i]).toString());
            }
            if(i == nums.length - 1) break;
            start = nums[i+1];
        }
        return result;
    }
}
