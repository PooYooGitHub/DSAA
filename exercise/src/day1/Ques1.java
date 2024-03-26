package day1;


import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int total = scanner.nextInt();
        int[] ints = new int[people];
        for (int i = 0; i < total; i++) {
            ints[scanner.nextInt()-1]++;
//            ints[i] = scanner.nextInt();//之前的做法是错的
        }

        for (int i = 1; i <= people; i++) {
//            while (ints[i]>0){
//                System.out.print(i+" ");
//                ints[i]--;
//            }
            for (int j = 0; j < ints[i-1]; j++) {
                System.out.print(i+" ");
            }
        }

        /*while (scanner.hasNext()){
            ints[i++]=scanner.nextInt();

        }*/



}}
