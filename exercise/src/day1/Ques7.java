package day1;

import java.util.Arrays;

public class Ques7 {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            //中间的元素
            return nums[nums.length/2];

        }
    }
}
