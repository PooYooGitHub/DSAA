package leetcode.two_pointer;

/**
 * author:
 * data:2024/3/14 19:45
 * function:
 * time: 60min,小阿giao
 */
public class Ques4 {
    class Solution {
        private boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i++)!=s.charAt(j--)) return false;
            }
        return true;
    }
        public boolean validPalindrome(String s) {
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (s.charAt(i)!=s.charAt(j)){
                    return new Solution().isPalindrome(s,i,j-1)||new Solution().isPalindrome(s,i+1,j);
                }
            }
            return true;
           /* int n = 1, i = 0, j = s.length() - 1;//思路不够清晰,这样想太复杂了，光是边界你就要想半天
            while (i < j) {
                if (s.charAt(i)!=s.charAt(j)&&n!=0) {
                    if (s.charAt(i+1)==s.charAt(j)) {
                        i++;
                        n--;
                    }
                    else if (s.charAt(i)==s.charAt(j-1)) {
                        j--;
                        n--;
                    }
                    else return false;
                }
                else if (s.charAt(i)!=s.charAt(j)&&n==0) return false;
                i++;
                j--;

            }
            return true;
*/
        }


    }
}
