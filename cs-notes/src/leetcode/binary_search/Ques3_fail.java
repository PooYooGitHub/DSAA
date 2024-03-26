package leetcode.binary_search;/**
 * author:
 * data:2024/3/24 10:15
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.binary_search
 * @className: Ques3
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/24 10:15
 * @version: 1.0
 */
public class Ques3_fail {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            /*
            本题特点：single一定是在偶数位上
                    if m=偶，
                        single>m,m在左边(nums[m]==nums[m+1])，l=m+2;
a                    if m!=偶
                        m--;===>m=偶
             */
            int l = 0, h = nums.length - 1;
            while (l < h) {
                int mid = l + (h - l) / 2;
                if (mid % 2 == 1) {
                    mid--;
                }
                if (nums[mid]==nums[mid+1]){
                    l = mid + 2;
                }else {
                    h = mid;
                }

            }
            return nums[l];

        }
    }
}

            //自己这样做太麻烦了，自己条件都判断不明白了
            /*int n = nums.length;
            int l = 0, h = n - 1, mid;
            if (l < h) {
                mid = l + (h - l) / 2;
                int tem = 0;
                if (nums[mid]==nums[mid+1]) {
                    tem = mid + 1;
                } else if (nums[mid]==nums[mid-1]) {
                    tem = mid - 1;
                }else return nums[mid];

                if ((tem - l) % 2 == 0) {
                    h = mid - 1;
                } else if ((h - tem) % 2 == 0) {
                    l = mid + 1;
                }
            }
            return nums[l];
        }
    }
}
*/