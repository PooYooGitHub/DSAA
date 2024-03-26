# Ques2 有感
### 题目
```text
给你一个字符数组 letters，该数组按非递减顺序排序，以及一个字符 target。letters 里至少有两个不同的字符。
返回 letters 中大于 target 的最小的字符。如果不存在这样的字符，则返回 letters 的第一个字符。
```
### 题解
```java
class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int n=letters.length;
            int l = 0, h = n - 1, mid;
            while (l <= h) {
                mid = l + (h - l) / 2;
                if (letters[mid] <= target) {
                    l = mid + 1;
                }else {
                    h = mid - 1;
                }
            }
            return l > n - 1 ? letters[0] : letters[l];
        }
    }
```
### 思路
* 这题就相当于**查找有重复元素的最右边**，
* 为什么`letters[mid] <= target`中的`=`要加在这，没错查找重复元素的***最右边***；这样就算nums[l]的值和目标值相同`l`也会向右靠，最终到最右边
* 边界不好确定，就画图推理