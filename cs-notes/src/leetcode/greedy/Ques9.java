package leetcode.greedy;/**
 * author:
 * data:2024/3/22 19:07
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.greedy
 * @className: Ques10
 * @author: Eric
 * @description: 最多改变数组中的1个数，使数组递增或相等
 * @date: 2024/3/22 19:07
 * @version: 1.0
 */
public class Ques9 {
    class Solution {
        public boolean checkPossibility(int[] nums) {
            int count=0;
            //尽量调整前一个数（因为这个数后面还有数），并且前面的数尽量保持比较小才好
            for (int i = 1; i < nums.length; i++) {
              if (nums[i]<nums[i-1]){
                  if (i==1||nums[i]>=nums[i-2]){
                      nums[i-1]=nums[i];
                      count++;
                  }
                  else /*if (nums[i]<nums[i-2])*/{//必须else，因为i-2
                      nums[i]=nums[i-1];
                      count++;
                  }
              }
              if (count>1){
                  return false;
              }
            }
            return true;
        }

        //这样就不能这样写了，因为这个函数可能可很复杂
        private boolean judge(int[] nums, int i) {
            for (; i < nums.length - 1; i++) {
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
            return true;
        }
    }
}
