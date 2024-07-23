package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> {
            return Math.abs(target - a) - Math.abs(target - b);
        });
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                if (nums[i] + nums[j] + nums[k] - target <= 0) {
                    pq.offer(nums[i] + nums[j] + nums[k]);
                    j++;
                } else {
                    pq.offer(nums[i] + nums[j] + nums[k]);
                    k--;
                }
            }
        }
        return pq.remove();
    }
}
