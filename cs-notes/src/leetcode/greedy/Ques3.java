package leetcode.greedy;/**
 * author:
 * data:2024/3/21 14:20
 * function:
 * time:
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 * @projectName: DSAA
 * @package: leetcode.sort
 * @className: Ques2
 * @author: Eric
 * @description: 求区间数组中有交集的数组
 * @date: 2024/3/21 14:20
 * @version: 1.0
 */
public class Ques3 {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points==null||points.length==1){
                return points==null?-1:1;
            }
            //=========================这里nums=1
            int nums = 1;

            Arrays.sort(points, Comparator.comparingInt(a ->a[1]));
            int right = points[0][1];
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] <= right) {
                    continue;
                }
                nums++;
                right = points[i][1];
            }

            return nums;

        }
    }
}
