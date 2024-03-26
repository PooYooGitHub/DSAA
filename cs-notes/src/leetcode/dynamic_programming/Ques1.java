package leetcode.dynamic_programming;/**
 * author:
 * data:2024/3/23 9:56
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.dynamic_programming
 * @className: Ques1
 * @author: Eric
 * @description: 70.爬楼梯问题
 * @date: 2024/3/23 9:56
 * @version: 1.0
 */
public class Ques1 {
    class Solution{
        public int climbStairs(int n) {
            if (n == 1 || n == 2) {
                return n;
            }
            /*
            //先用没有优化的方法
            int[] ints = new int[n+1];
            ints[1] = 1;
            ints[2] = 2;
            for (int i = 3; i <= n; i++) {
                ints[i]=ints[i-1]+ints[i - 2];
            }
            return ints[n];
            */
            //优化后的方法(优化空间)
            int a = 1, b = 2;
            for (int i = 3; i <= n; i++) {
                int tem = a;
                a = b;
                b = tem + b;//让b始终在前面，
            }
            return b;
        }
    }
}
