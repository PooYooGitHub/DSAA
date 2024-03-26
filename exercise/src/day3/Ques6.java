package day3;

/**
 * author:
 * data:2024/3/17 15:21
 * function: Boyer-Moore Majority Voting Algorithm
 * time:
 */
public class Ques6 {
    class Solution {
        public int majorityElement(int[] nums) {
            int candidate = -1;
            int weight = 0;
            for (int i = 0; i < nums.length; i++) {
                if (weight == 0) {
                    candidate=nums[i];
                    weight++;
                }
                else {
                    if (candidate == nums[i]) {
                        weight++;
                    }else weight--;
                }
            }

            return candidate;
        }
    }
}
