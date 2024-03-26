package chapter1_foundation;/**
 * author:
 * data:2024/3/24 16:41
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: chapter1_foundation
 * @className: IsPrime
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/24 16:41
 * @version: 1.0
 */
public class IsPrime {
    /**
     * 用于判断是否为素数
     * @param N
     * @return 为素数返回true，否则返回false
     */
    public static boolean isprime(int N) {
        if (N < 2) return false;//规定1不是素数
        for (int i = 2; i*i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;


    }
}
