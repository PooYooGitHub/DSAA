package leetcode.two_pointer;

/**
 * author:
 * data:2024/3/14 16:41
 * function:
 */
public class Ques1 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 1;
            int right = numbers.length;
            while (left<right){
                if (numbers[left]+numbers[right]==target)
                    return new int[]{left,right};
                else if (numbers[left]+numbers[right]<target) {
                    left++;
                }
                else {
                    right++;
                }
            }
            return null;
        }
    }
}
