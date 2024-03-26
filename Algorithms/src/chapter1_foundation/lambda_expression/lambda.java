package chapter1_foundation.lambda_expression;/**
 * author:
 * data:2024/3/26 10:00
 * function:
 * time:
 */

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @projectName: DSAA
 * @package: chapter1_foundation.lambda_expression
 * @className: lambda
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/26 10:00
 * @version: 1.0
 */
public class lambda {
    @Test
    public void test1(){
        //最原始的写法
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(1, 2));

    }

    @Test
    public void test2() {
        //lambda表达式
       Comparator<Integer> comparator = (o1,o2) -> Integer.compare(o1, o2);

          System.out.println(comparator.compare(1, 2));
       }

    @Test
    public void test3(){
        //创建二维数组
        int[][] arr = new int[][]{{1,2},{3,4},{5,6}};
        //按照数组的第一个元素降序排列
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //返回值为正数时，o1在o2后面；返回值为负数时，o1在o2前面；返回值为0时，o1和o2相等，数组顺序不变
                return o2[0]-o1[0];
            }
        });
        //用lambda表达式实现
        Arrays.sort(arr, (o1, o2) -> o2[0]-o1[0]);
        //输出排序后的数组
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
    @Test
    public void test4(){
        //创建一个大顶堆，原始方法
        //大顶堆说白了就是一个优先队列，队列中的元素按照从大到小的顺序排列
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //lambda表达式
        PriorityQueue<Integer> maxheap1 = new PriorityQueue<>((o1,o2)->o2-o1);
        maxheap1.add(8);
        maxheap1.add(7);
        maxheap1.add(6);
        maxheap1.add(5);
        maxheap1.add(4);
        maxheap1.add(3);
        //输出
        System.out.println(maxheap1.poll());
        System.out.println(maxheap1.poll());

    }



}
