package sort;

/*
* 冒泡排序：相邻两个元素比较，较大的元素逐渐上行，跑到数组末尾，就像开水里的泡泡一样
* */
public class BubbleSort {
    public void bubbleSort(int[] nums) {
        for (int i = nums.length-1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                if (nums[j]>nums[j+1]){
                    int n=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=n;
                }
            }
        }
    }
}
