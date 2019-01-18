package main.sort;

public class SelectionSort {
    public int[] selectionSort(int[] array){
        int length = array.length;
        int min;//定义未排序数组中的最小值
        int temp;
        //一共循环length-1次，每次排出一个最小值
        for(int i = 0; i<length-1; i++){
            //初始化最小值为未排序的第一个数
            min = array[i];
            temp = i;
            //比较length-i次，找出最小值，和第i个值交换位置
            for(int j=i+1; j<length; j++){
                if(min > array[j]){
                    min = array[j];
                    temp = j;
                }
            }

            array[temp] = array[i];
            array[i] = min;

        }
        return array;
    }
}
