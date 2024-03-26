package leetcode.greedy;/**
 * author:
 * data:2024/3/22 14:17
 * function:
 * time:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

/**
 * @projectName: DSAA
 * @package: leetcode.greedy
 * @className: Ques4
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/22 14:17
 * @version: 1.0
 */
public class Ques4 {
    class Solution{
        public int[][] reconstructQueue(int[][] people) {
            if (people==null||people.length==1){
                return people==null?null:people;
            }
            //按第一个属性降序，相同则第二个属性升序
            Arrays.sort(people, (a,b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));
            ArrayList<int[]> ints = new ArrayList<>();
            //按第二个数插入
            for (int i = 0; i < people.length; i++) {
                ints.add(people[i][1],people[i]);
            }
/*
            for(int[] p:people){

            }
*/
            return ints.toArray(new int[ints.size()][]);
        }
    }
}
