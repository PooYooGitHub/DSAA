package leetcode.greedy;/**
 * author:
 * data:2024/3/22 18:40
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.greedy
 * @className: Ques8
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/22 18:40
 * @version: 1.0
 */
public class Ques8 {
    class Solution {
        public boolean isSubsequence(String s, String t) {

            for (int i = 0, j = 0; i < s.length(); i++,j++) {
                char a = s.charAt(i);
                try {
                    while (a!=t.charAt(j)){
                        j++;
                    }
                }catch (Exception c){
                    return false;
                }
            }

            return true;
        }
    }
}
