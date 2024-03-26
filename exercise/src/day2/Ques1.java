package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ques1 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            ArrayList<Integer> integers = new ArrayList<>();
            int index1 = 0, index2 = 0;
            while (index1<nums1.length&&index2<nums2.length){
                if (nums1[index1]<nums2[index2]){
                    index1++;
                } else if (nums1[index1] > nums2[index2]) {
                    index2++;
                }
                else {
                    integers.add(nums1[index1]);
                    index1++;
                    index2++;
                }

            }
            return integers.stream().mapToInt(i -> i).toArray();

        }
    }

}
