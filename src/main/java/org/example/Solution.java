package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //create a priority queue that puts the sum of three integers that is closest
        //to 0 in the front
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> Math.abs(a - target)));
        //sort the given array
        Arrays.sort(nums);
        //iterate through the given array
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            //check for all sums while index j is less than index k
            while (j < k) {
                //add the current sum to the priority queue
                int sum = nums[i] + nums[j] + nums[k];
                pq.offer(sum);
                //move the two pointers based on if the sum subtracts the target is
                //less than, or bigger than 0
                if (sum - target < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        //return the top of the queue
        return pq.remove();
    }
}
