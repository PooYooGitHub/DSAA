package leetcode.binary_search;/**
 * author:
 * data:2024/3/24 14:21
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.binary_search
 * @className: Ques6
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/24 14:21
 * @version: 1.0
 */
public class Ques6_hardinboundary {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            if(nums.length==0||nums==null) {
                return new int[]{-1, -1};
            }
            int left = whereToInsert(nums, (double)target-0.5);
            int right = whereToInsert(nums, (double) target+0.5)-1;
            if (target!=nums[left]||left==nums.length){
                return new int[]{-1,-1};
            }else return new int[]{left,right};

        }

        public int whereToInsert(int[] nums,double target) {
            int l = 0, h = nums.length, mid;//这里h的值
            while (l <= h) {
                mid = l + (h - l) / 2;
                if (nums[mid] < target) {
                    l = mid + 1;
                } else h = mid - 1;
            }
            return l;
        }
    }

}
