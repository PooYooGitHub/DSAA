package day3;

import java.math.BigInteger;

/**
 * author:
 * data: 2024/3/16 14:04
 * function:
 * time:
 */
public class Ques1 {
    public static void main(String[] args) {
        BigInteger sum=BigInteger.ZERO; // 初始化累加和为0
        for (int i = 1; i <= 100; i++) {
            BigInteger sig=BigInteger.ONE; // 使用BigInteger存储i
            for (int j = i - 1; j > 0; j--) {
                sig=sig.multiply(BigInteger.valueOf(j)); // 计算阶乘
            }
            sum = sum.add(sig); // 累加阶乘结果
            System.out.println(sum.mod(BigInteger.valueOf(1000000000))); // 输出结果模1000000000的值
        }
    }
}
