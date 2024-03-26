package binary_search;/**
 * author:
 * data:2024/3/23 15:33
 * function:
 * time:
 */

/**
 * @projectName: DSAA
 * @package: binary_search
 * @className: WhereToInsert
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/23 15:33
 * @version: 1.0
 */
public class WhereToInsert {
    int simple(int[] nums, int target) {
        //没有重复的情况
        int l = 0, h = nums.length - 1, mid;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == target) {//有与目标相同的元素
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }else {
                h = mid - 1;//必须+1-1,不然越不过去(怎么想的？就考虑特殊情况)
            }

        }
        return l;
    }

    int repeat(int[] nums, int target) {
       int l = 0, h = nums.length - 1, mid;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == target) {//有与目标相同的元素
                h = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }else {
                h = mid - 1;//必须+1-1,不然越不过去(怎么想的？就考虑特殊情况)
            }

        }
        return l;
    }
}
