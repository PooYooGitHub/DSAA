package leetcode.two_pointer;

import java.util.HashSet;

/**
 * author:
 * data:2024/3/14 18:45
 * function:
 * time: 60 min 逆天，做了1个小时
 */
public class Ques3 {
    class Solution {
        public String reverseVowels(String s) {
            int i=0;
            int j=s.length()-1;
            HashSet<Character> chars = new HashSet<>();
            chars.add('a');
            chars.add('e');
            chars.add('i');
            chars.add('o');
            chars.add('u');
            chars.add('A');
            chars.add('E');
            chars.add('I');
            chars.add('O');
            chars.add('U');
            StringBuilder stringBuilder = new StringBuilder(s);
            while (i < j) {
                while (i<j&&!chars.contains(s.charAt(i))) i++;//一直找，直到找到
                while (i<j&&!chars.contains(s.charAt(j))) j--;
//                if (i==j) break;这种情况就是自己与自己交换，不用写
                swap(stringBuilder,i,j);
                i++;
                j--;
            }
            return stringBuilder.toString();
        }

        private void swap(StringBuilder s, int i, int j) {
            char a = s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,a);

        }
    }
}
