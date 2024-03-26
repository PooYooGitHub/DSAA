package sort;

import java.util.Arrays;

/*
* 插入排序：将未排序的数插入已排好的数组中，和打牌时理牌很像
* */
public class InsertSort {
    public void insertSort(int nums[]){
        //默认第一个已排序
        for (int i = 1; i < nums.length; i++) {
            //i=未排序的数下标
            int num = nums[i];
            int j = i - 1;
            while (nums[j] > num && j >= 0) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1]=num;

        }
    }
}
