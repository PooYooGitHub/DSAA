package day3;

import java.util.ArrayList;

/**
 * author:
 * data:2024/3/17 16:46
 * function:
 * time:
 */
public class tryhh {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        int[] ints = new int[integers.size()];
        int j = 0;
        for (int i:integers
             ) {
            ints[j++]=i;
        }
        for (int i : ints
        ) {
            System.out.println(i);
        }
    }
}
