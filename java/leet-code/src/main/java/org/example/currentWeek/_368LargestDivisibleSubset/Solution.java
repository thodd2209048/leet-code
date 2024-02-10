package org.example.currentWeek._368LargestDivisibleSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int numsLength = nums.length;
        Arrays.sort(nums);
        int[] count = new int[numsLength];
        int[] pre = new int[numsLength];

        Arrays.fill(count, 1);
        Arrays.fill(pre, -1);
        int max = 0; int index = 0;

        for (int i = 0; i < numsLength; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && count[j] + 1 > count[i]) {
                    count[i] = count[j] + 1;
                    pre[i] = j;
                }
            }
            if(count[i] > max){
                max = count[i];
                index = i;
            }
        }

        List<Integer> largestDivisibleSubset = new ArrayList<>();
        while (index > -1){
            largestDivisibleSubset.add(nums[index]);
            index = pre[index];
        }
        return largestDivisibleSubset;
    }
}
