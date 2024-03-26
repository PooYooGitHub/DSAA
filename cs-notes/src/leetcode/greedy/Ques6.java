package leetcode.greedy;/**
 * author:
 * data:2024/3/22 17:12
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.greedy
 * @className: Ques6
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/22 17:12
 * @version: 1.0
 */
public class Ques6 {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 1) {
                return 0;
            }
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i]>prices[i-1]){
                    profit+=prices[i]-prices[i-1];
                }
            }
            return profit;
        }
    }

}
