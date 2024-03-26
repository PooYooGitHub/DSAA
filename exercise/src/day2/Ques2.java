package day2;

import java.util.Arrays;

public class Ques2 {
    class Solution {
        public char findTheDifference(String s, String t) {
            char[] array1 = s.toCharArray();
            char[] array2 = t.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            for (int i = 0; i < array2.length; i++) {
                if(i==array2.length-1)
                    return array2[array2.length-1];
                else {
                    if (array1[i]!=array2[i])
                        return array2[i];
                }
            }

            return 1;
        }
    }
}
