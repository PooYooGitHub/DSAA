package leetcode.greedy;/**
 * author:
 * data:2024/3/22 16:10
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.greedy
 * @className: Ques5
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/22 16:10
 * @version: 1.0
 */
public class Ques5 {
    class Solution {
        public int maxProfit(int[] prices) {
            int n=prices.length;
            if (n==1){
                return 0;
            }
            //这是i之前的状态
            int minin = prices[0];
            int maxprofit = 0;

            for (int i = 1; i < prices.length; i++) {
                maxprofit=Math.max(maxprofit,prices[i]-minin);
                minin=Math.min(minin,prices[i]);
            }
            return maxprofit;
        }
    }
}
