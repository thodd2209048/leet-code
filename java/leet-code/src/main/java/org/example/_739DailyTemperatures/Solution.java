package org.example._739DailyTemperatures;

import java.util.Stack;

public class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty()){
                int[] topInteger = stack.peek();
                if (topInteger[0] >= temperatures[i]) {
                    break;
                }
                result[topInteger[1]] = i - topInteger[1];
                stack.pop();
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
