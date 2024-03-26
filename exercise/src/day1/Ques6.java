package day1;

import java.util.Arrays;

public class Ques6 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n==0){

            }
            else {for (int i = m,j=0; i < m+n; i++) {
                nums1[i]=nums2[j++];
            }
            Arrays.sort(nums1);
        }}
    }
}
