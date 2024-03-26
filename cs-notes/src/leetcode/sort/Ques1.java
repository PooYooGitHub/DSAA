package leetcode.sort;

import java.util.PriorityQueue;

/**
 * author:
 * data:2024/3/15 19:45
 * function: 第 k 大元素
 * time:
 */
public class Ques1 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> minheap = new PriorityQueue<>();
            for (int i = 0; i < nums.length; i++) {
                if (i < k) {
                    minheap.add(nums[i]);
                }
                else {
                    if (nums[i]>minheap.peek()){
                        minheap.poll();
                        minheap.add(nums[i]);
                    }
                    else continue;
                }
            }
            return minheap.poll();
        }
    }
}
