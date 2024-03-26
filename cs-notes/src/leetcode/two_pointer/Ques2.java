package leetcode.two_pointer;

/**
 * author:
 * data:2024/3/14 17:18
 * function:
 */
public class Ques2 {

    static class Solution {
        public boolean judgeSquareSum(int c) {
            int left=0;
            int right = (int)Math.sqrt((double)c);
            while (left<=right){
                int i=left*left;
                int j=right*right;
                if (i+j==c){
                    return true;
                }
                else if(i+j>c){
                    right--;
                }
                else left++;
            }
            return false;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.judgeSquareSum(2147483600));
        }
    }
}
