package org.example.currentWeek._231PowerofTwo;

//https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2024-02-19
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        while (n % 2 == 0 && n > 1) {
            n /= 2;
            if (n == 1) return true;
        }
        return false;
    }
}
