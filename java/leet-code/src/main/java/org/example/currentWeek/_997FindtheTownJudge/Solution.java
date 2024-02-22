package org.example.currentWeek._997FindtheTownJudge;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        if (trust.length == 0) return -1;

        int[] canNotBeJudge = new int[n + 1];
        int[] trustedLevel = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            canNotBeJudge[trust[i][0]] = 1;
            trustedLevel[trust[i][1]] += 1;
        }
        for (int i = 1; i < n + 1; i++) {
            if (canNotBeJudge[i] == 0 && trustedLevel[i] == n - 1) return i;
        }
        return -1;
    }
}
