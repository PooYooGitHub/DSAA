package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i]=scanner.nextInt();
        }
        Arrays.sort(ints);
        System.out.println(ints[k]);
    }
}
