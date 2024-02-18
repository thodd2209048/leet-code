package org.example.currentWeek._1642FurthestBuildingYouCanReach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> diffList = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];

            if (diff <= 0) continue;

            if (diff <= bricks) {
                bricks -= diff;
            } else {
                if (ladders == 0) return i - 1;
                ladders--;
                if (diffList.peek() == null || diff > diffList.peek()) continue;

                bricks = bricks + diffList.poll() - diff;
            }
            diffList.add(diff);
        }
        return heights.length - 1;
    }
}
