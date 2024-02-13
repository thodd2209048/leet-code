package org.example.currentWeek._338CountingBits;

public class Solution {
    public static int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        int[] result = new int[n + 1];
        result[0] = 0;
        int exponential = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i == exponential) {
                result[i] = 1;
                exponential *=2;
            } else {
                result[i] = result[i - exponential/2] + 1;
            }
        }
        return result;
    }
}
