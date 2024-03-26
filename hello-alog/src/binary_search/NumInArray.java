package binary_search;/**
 * author:
 * data:2024/3/23 14:53
 * function:
 * time:
 */

import java.awt.image.renderable.RenderableImage;

/**
 * @projectName: DSAA
 * @package: binary_search
 * @className: BinarySearch
 * @author: Eric
 * @description: TODO
 * @date: 2024/3/23 14:53
 * @version: 1.0
 */
public class NumInArray {
    int binarySearch_leftandright(int[] nums, int target) {
        //左闭右闭
        int l = 0, h = nums.length - 1,mid;

        while (l <= h) {
            mid = l + (h - l) / 2;
            if (target==nums[mid]){
                return mid;
            } else if (nums[mid] < target) {
                l=mid+1;
            }else {
                h=mid-1;
            }

        }
        return -1;
    }
    int binarySearch_left(int[] nums, int target){
        //左闭右开
        int l = 0, h = nums.length, mid;
        while (l < h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }else {
                h = mid;
            }
        }
        return -1;
    }
}
