package chapter1_foundation;/**
 * author:
 * data:2024/3/24 18:29
 * function:
 * time:
 */

import java.util.Scanner;

import static com.sun.deploy.net.MessageHeader.merge;

/**
 * @projectName: DSAA
 * @package: chapter1_foundation
 * @className: practice
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/24 18:29
 * @version: 1.0
 */
public class practice {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b=Integer.parseInt("10");
        String c = String.valueOf(a);
        System.out.println(c+b);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        while (!scanner.hasNext("#")){
            System.out.print(scanner.next());
        }
        System.out.println("结束");
    }




}
