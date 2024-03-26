package leetcode.binary_search;/**
 * author:
 * data:2024/3/24 13:51
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.binary_search
 * @className: Ques5
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/24 13:51
 * @version: 1.0
 */
public class Ques5 {
    class Solution {
        public int findMin(int[] nums) {
            int l = 0, h = nums.length - 1, mid;
            while (l <= h) {
                mid = l + (h - l) / 2;
                if (nums[l] > nums[h]&&nums[mid]>nums[h]) {
                    l = mid + 1;
                } else if (nums[l] > nums[h] && nums[mid] < nums[h]) {
                    h = mid;
                }else return nums[l];
            }
            return nums[l];//这个没有用，不会在这退出
        }
    }
}
