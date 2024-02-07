package org.example.currentWeek._268MissingNumber;

//https://leetcode.com/problems/missing-number/
public class Solution {
    public static int missingNumber(int[] nums) {
        int sumExpect = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int n : nums
        ) {
            sum += n;
        }
        return sumExpect - sum;
    }
}
