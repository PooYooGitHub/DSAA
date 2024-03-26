package day3;

/**
 * author:
 * data:2024/3/16 21:19
 * function:
 * time:
 */
public class Ques3 {
    class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1||nums.length==2){
            return nums.length==1?1:2;
        }
        int move = 0, i = 0, j = 2;

        while (j < nums.length - move) {
            if (nums[i] == nums[j]) {
                //向左移动数组
                int k = i;
                while (k < nums.length - move - 1) {
                    nums[k]=nums[++k];
                }
                //
                move++;
            }
            else {
                i++;
                j++;
            }
        }

        return nums.length-move;
    }
}
}
