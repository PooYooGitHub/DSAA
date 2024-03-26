package day2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * author:
 * data:2024/3/16 10:06
 * function:
 * time:
 */
//可以用lambda表达式简化的前提：匿名内部类是一个接口，且接口中只有一个抽象方法需要重写；
//不关注类名，不关注方法名，只关注方法的参数和方法体
public class try_lambda {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中的run方法执行了");
            }
        }).start();

        new Thread(()->{
            System.out.println("新线程中的run方法执行了");
        }).start();
        int[][] ints = {{1, 2}, {3, 4}};

    }
}
