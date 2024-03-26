package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = scanner.nextInt();
        }
        Arrays.sort(ints);
        for (int i:ints
             ) {
            System.out.print(i+" ");
        }
    }
}
