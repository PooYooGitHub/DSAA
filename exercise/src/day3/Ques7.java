package day3;

/**
 * author:
 * data:2024/3/17 16:35
 * function:
 * time:
 */
public class Ques7 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }
            int i = 2;
            for (int j = 2; j < nums.length; j++) {
                if (nums[j]!=nums[i-2]){
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
