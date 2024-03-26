package leetcode.greedy;

import java.util.Arrays;

/**
 * author:
 * data:2024/3/16 9:01
 * function:
 * time:
 */
public class Ques1 {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int satisfy = 0;
            for (int i = 0, j = 0; i < g.length && j < s.length; ) {
                if (s[j]==g[i]){
                    i++;j++;satisfy++;
                } else if (s[j] < g[i]) {
                    g[i]-=s[j];
                    j++;
                }else {
                    s[j]-=g[i];
                    i++;satisfy++;
                }
            }
            return satisfy;
        }
    }
}
