package leetcode.greedy;/**
 * author:
 * data:2024/3/22 17:46
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.greedy
 * @className: Ques7
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/22 17:46
 * @version: 1.0
 */
public class Ques7 {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int total = 0;
            int m = flowerbed.length;
            for (int i = 0; i < m && total < n; i++) {
                if (flowerbed[i] == 1) {
                    continue;
                }
                int pre = i == 0 ? 0 : flowerbed[i - 1];
                int next = i == m - 1 ? 0 : flowerbed[i + 1];
                if (pre == 0 && /*flowerbed[i] == 0 &&*/ next == 0) {//这里前面以及判断了，才下来的
                    total++;
                    flowerbed[i]=1;
                }

            }

            return total==n;
        }

    }}