package org.example.longTimeAgo._279PerfectSquares;

import java.util.Arrays;

public class Solution {
    public static int numSquares(int n) {
        int[] resultArray = new int[n + 1];
        Arrays.fill(resultArray, Integer.MAX_VALUE);
        resultArray[0] = 0;
        int unit = 1;
        while (unit * unit <= n) {
            int square = unit * unit;
            for (int i = square; i <= n; i++) {
                resultArray[i] = Integer.min(resultArray[i], resultArray[i - square] + 1);
            }
            unit++;
        }
        return resultArray[n];
    }
}
