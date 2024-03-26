package leetcode.binary_search;/**
 * author:
 * data:2024/3/24 13:36
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: leetcode.binary_search
 * @className: Ques4
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/24 13:36
 * @version: 1.0
 */
public class Ques4 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      ; */

    boolean isBadVersion(int version){
        return false;
    }
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {//1....n
            int l = 1, h = n, mid;
            while (l <= h) {
                mid = l + (h - l) / 2;
                if (isBadVersion(mid)) {
                    h=mid-1;
                } else l = mid + 1;
            }
            return l;
        }
    }

    private class VersionControl {
    }
}
