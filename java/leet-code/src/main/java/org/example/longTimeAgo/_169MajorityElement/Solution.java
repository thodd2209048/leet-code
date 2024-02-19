package org.example.longTimeAgo._169MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        int n = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            numCount.putIfAbsent(nums[i], 0);
            numCount.computeIfPresent(nums[i], (k, v) -> v + 1);
            if (numCount.get(nums[i]) > n) return nums[i];
        }
        return 0;
    }
}
