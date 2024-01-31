package org.example._739DailyTemperatures;

//https://leetcode.com/problems/daily-temperatures/description/?envType=daily-question&envId=2024-01-31
public class Main {
    public static void main(String[] args){
        int[] input = new int[]{73,74,75,71,69,72,76,73};
        int[] output = Solution.dailyTemperatures(input);
        System.out.println(output);
    }
}
