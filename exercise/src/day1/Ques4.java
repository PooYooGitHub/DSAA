package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i]=scanner.nextInt();
        }
        int total=N;
        Arrays.sort(ints);
        for (int i = 0; i < N-1; i++) {
            if (ints[i]==ints[i+1]){
                ints[i]=-1;
                total--;
            }
        }
        System.out.println(total);
        for (int i = 0; i < N; i++) {
            if (ints[i]==-1){
                continue;
            }
            System.out.print(ints[i]+" ");
        }
    }
}
