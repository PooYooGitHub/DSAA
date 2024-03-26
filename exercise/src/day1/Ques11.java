package day1;

import java.util.ArrayList;

    public class Ques11 {
        class Solution {
            public int[] intersection(int[] nums1, int[] nums2) {

                ArrayList<Integer> integers = new ArrayList<>();
                for (int i = 0; i < nums1.length; i++) {
                    for (int j = 0; j < nums2.length; j++) {
                        if (nums2[j]==nums1[i]&&!integers.contains(nums1[i])){
                            integers.add(nums1[i] );
                        }
                    }

                }

                return integers.stream().mapToInt(i -> i).toArray();
            }
        }
    }



