package org.example.longTimeAgo._2971FindPolygonWiththeLargestPerimeter;

import java.util.Arrays;

public class Solution {
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long current = nums[0];
        long max = -1;
        for (int i = 2; i < nums.length; i++) {
            current += nums[i-1];
            if(current > nums[i]) {
                max = current + nums[i];
            }
        }
        return max;
    }
}
