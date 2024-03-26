package day3;

import java.util.Arrays;

/**
 * author:
 * data:2024/3/17 10:50
 * function:
 * time:
 */
public class Ques4 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums2.length==1||nums1.length==1){
                return nums1.length==1?nums1[0]:nums2[0];
            }
            int i = 0, j = 0,k=0;
            int[] ints = new int[nums1.length + nums2.length];
            for (int a:nums1
                 ) {
                ints[k++]=a;
            }
            for (int b :
                    nums2) {
                ints[k++]=b;
            }
            Arrays.sort(ints);
            if (ints.length%2==0){
                return (ints[ints.length/2]+ints[ints.length/2+1])/2;
            }
            else return ints[ints.length/2];


        }
    }
}
