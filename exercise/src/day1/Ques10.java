package day1;

public class Ques10 {
    class Solution {
        public int missingNumber(int[] nums) {
            int n=nums.length;
            boolean[] booleans = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                booleans[nums[i]]=true;
            }
            int m=0;
            for (int i = 0; i < n + 1; i++) {
                if (!booleans[i]){
                    m=i;
                    break;
                }
            }
            return m;


        }
    }
}
