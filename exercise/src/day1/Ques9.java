package day1;

public class Ques9 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length()!=t.length()){
                return false;
            }
            int[] ints = new int[26];
            for (int i = 0; i < s.length(); i++) {
                ints[(int)(s.charAt(i)-'a')]++;
                ints[(int)(t.charAt(i)-'a')]--;

            }
            for (int i = 0; i < 26; i++) {
                if (ints[i]!=0)
                    return false;
            }
            return true;

        }
    }
}
