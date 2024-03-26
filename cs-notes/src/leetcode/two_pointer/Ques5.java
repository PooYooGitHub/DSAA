package leetcode.two_pointer;

/**
 * author:
 * data:2024/3/14 20:55
 * function:
 * time: 40min 还没做出来，逆天
 */
public class Ques5 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //双指针，从后往前
            int i = m - 1, j = n - 1, k = m + n - 1;
            while (j >= 0) {
                if (i < 0) {//用这两个条件来约束i和j的边界情况
                    nums1[k--]=nums2[j--];
                }
                else if(nums1[i]>nums2[j]){
                    nums1[k--]=nums1[i--];
                }
                else
                    nums1[k--]=nums2[j--];

            }//如果数组二被抽完了，那剩下的数组一就是排好的，直接不用动就好了
    }
}}
