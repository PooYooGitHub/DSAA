package leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/**
 * author:
 * data:2024/3/16 13:24
 * function:
 * time:
 */
public class Ques2 {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            if(intervals==null){
                return -1;
            }
            //按照右边界排序
            Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));
            int right=intervals[0][1];
            int none = 1;
            //找出所有不会重复的区间，其他的直接减就好了
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < right) {
                    //说明有重合
                    continue;
                }
                right=intervals[i][1];
                none++;
            }

            return intervals.length-none;
        }
    }

}
