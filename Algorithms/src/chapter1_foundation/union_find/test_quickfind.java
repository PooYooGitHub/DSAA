package chapter1_foundation.union_find;/**
 * author:
 * data:2024/3/25 19:42
 * function:
 * time:
 */

import com.sun.scenario.effect.impl.HeapImage;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @projectName: DSAA
 * @package: chapter1_foundation.union_find
 * @className: test_quickfind
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/25 19:42
 * @version: 1.0
 */
public class test_quickfind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        quick_find quickFind = new quick_find(N);//初始化N个触点
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (quickFind.connected(a, b)) {
                System.out.println("已连接");
            } else quickFind.union(a, b);
            System.out.println(a+" "+b);
        }
        //创建大顶堆和小顶堆
        PriorityQueue<Integer> minheap = new PriorityQueue<>();//小顶堆
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((x,y)->(y-x));//大顶堆

        System.out.println(quickFind.getCount()+"个");



    }
}
