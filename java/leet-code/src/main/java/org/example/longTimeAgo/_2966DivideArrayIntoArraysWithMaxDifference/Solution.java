package org.example.longTimeAgo._2966DivideArrayIntoArraysWithMaxDifference;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[][] divideArray(int[] nums, int k) {
        if(nums.length%3 !=0) {
            return new int[][]{};
        }
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-2; i += 3){
            if(nums[i+2] - nums[i] > k) return new int[][]{};
            result.add(new int[]{nums[i], nums[i+1],nums[i+2]});
        }
        int[][]ans = new int[result.size()][3];
        int index = 0;
        for (int[] i : result
             ) {
            ans[index++] = i;
        }
        return ans;
    }
}
