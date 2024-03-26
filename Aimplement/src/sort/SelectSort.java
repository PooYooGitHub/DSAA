package sort;

/*
* 选择排序：每次将未排序的数组中最小的放到已排序数组的末尾
* */
public class SelectSort {
    public void selectSort(int []nums){
        for (int i = 0; i < nums.length-1; i++) {
            //i=已排序数组的下一位，未排序的开始
            int k=i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[k]>nums[j]){
                    k=j;
                }
            }
            int n=nums[k];
            nums[k]=nums[i];
            nums[i]=n;
        }
    }
}
