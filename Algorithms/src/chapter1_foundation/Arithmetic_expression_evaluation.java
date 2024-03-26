package chapter1_foundation;/**
 * author:
 * data:2024/3/25 16:09
 * function:
 * time:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * @projectName: DSAA
 * @package: chapter1_foundation
 * @className: Arithmetic_expression_evaluation
 * @author: Eric
 * @description: 算数表达式求值
 * @date: 2024/3/25 16:09
 * @version: 1.0
 */
public class Arithmetic_expression_evaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> vals = new Stack<>();
        Stack<String> ops = new Stack<>();
        //读入数据
        System.out.println("请输入要求的表达式：");
        String[] s = scanner.nextLine().split(" ");
        for (String a:s){
            if (a.equals("(")) continue;
            else if(a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/")||a.equals("sqrt")) ops.push(a);
            else if (a.equals(")")) {
                String b=ops.pop();//运算符出栈
                Double c=vals.pop();
                if (b.equals("+")) c = vals.pop() + c;
                else if (b.equals("-")) c = vals.pop() - c;
                else if (b.equals("*")) c = vals.pop() * c;
                else if (b.equals("/"))c = vals.pop() / c;
                else if (b.equals("sqrt"))c = Math.sqrt(c);
                vals.push(c);
            }
            else vals.push(Double.valueOf(a));

        }
        System.out.println("最终的结果为" + vals.pop());
    }
}



