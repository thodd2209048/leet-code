package org.example.currentWeek.__258AddDigits;

public class Solution {
    public static int addDigits(int num) {
        while (num >= 10) {
            num = processNumber(num);
        }
        return num;
    }

    public static int processNumber(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
