package org.example.currentWeek._414ThirdMaximumNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int result = nums[nums.length - 1];
        int count = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (result > nums[i]) {
                result = nums[i];
                count++;
                if(count == 3) return result;
            }
        }
        return nums[nums.length - 1];
    }
}
