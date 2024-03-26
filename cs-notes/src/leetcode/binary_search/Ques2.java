package leetcode.binary_search;/**
 * author:
 * data:2024/3/24 9:43
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.binary_search
 * @className: Ques2
 * @author: Eric
 * @description: 744.
 * @date: 2024/3/24 9:43
 * @version: 1.0
 */
public class Ques2 {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int n=letters.length;
            int l = 0, h = n - 1, mid;
            while (l <= h) {
                mid = l + (h - l) / 2;
                if (letters[mid] <= target) {
                    l = mid + 1;
                }else {
                    h = mid - 1;
                }
            }
            return l > n - 1 ? letters[0] : letters[l];
        }
    }
}
