package org.example.longTimeAgo._2149RearrangeArrayElementsbySign;

public class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int[] positiveNums = new int[nums.length / 2];
        int[] negativeNums = new int[nums.length / 2];
        int i = 0;
        int j = 0;
        for (int num : nums
        ) {
            if (num > 0) {
                positiveNums[i] = num;
                i++;
            } else {
                negativeNums[j] = num;
                j++;
            }
        }
        for (int k = 0; k < nums.length / 2; k++) {
            nums[k*2] = positiveNums[k];
            nums[k*2+1] = negativeNums[k];
        }
        return nums;
    }
}

//    int[] result = new int[nums.length];
//    int i = 0;
//    int j = 1;
//        for (int num : nums
//                ) {
//                if (num > 0) {
//                result[i] = num;
//                i += 2;
//                } else {
//                result[j] = num;
//                j += 2;
//                }
//                }
//                return result;