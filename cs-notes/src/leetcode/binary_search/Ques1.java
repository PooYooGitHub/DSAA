package leetcode.binary_search;/**
 * author:
 * data:2024/3/23 13:42
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.binary_search
 * @className: Ques1
 * @author: Eric
 * @description: 69.x的平方根
 * @date: 2024/3/23 13:42
 * @version: 1.0
 */
public class Ques1 {
    class Solution {
        public int mySqrt(int x) {
            int l = 0, h = x, mid;
            while (l < h) {
                mid = l + (h - l) / 2;
                int result = x / mid;
                if (result == mid) {
                    return result;
                } else if (result < mid) {
                    h = mid - 1;
                }else {
                    l = mid + 1;
                }
            }
            return h;
        }
    }
}


//            if (x==0||x==1){
//                return x;
//            } else if (x==2||x==3||x==4||x==5){
//                return x/2;
//            }
//            int l = 0, h = x / 2, mid;
//            while (l < h && h - l != 1) {
//                mid = l + (h - l) / 2;
//                if (mid * mid == x) {
//                    return mid;
//                } else if (mid * mid < x) {
//                    l = mid;
//                } else h = mid;
//            }
//            return l;
//        }


