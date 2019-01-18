package main.sort;

public class insertionSort {
    public int[] BinaryInsertionSort(int[] array){

        int len = array.length;

        for(int i=1;i<len;i++){

            int temp = array[i];  //存储待排序的元素值

            if(array[i-1]>temp){  //比有序数组的最后一个元素要小

                int insertIndex = binarySearch(0, i-1, temp, array); //获取应插入位置的下标
                for(int j=i;j>insertIndex;j--){  //将有序数组中，插入点之后的元素后移一位
                    array[j]= array[j-1];
                }

                array[insertIndex]= temp;  //插入待排序元素到正确的位置
            }
        }
        return array;
    }

    /**
     * 二分查找法
     * @param lowerBound 查找段的最小下标
     * @param upperBound 查找段的最大下标
     * @param target 目标元素
     * @return 目标元素应该插入位置的下标
     */
    public int binarySearch(int lowerBound,int upperBound,int target, int[] array){
        int curIndex=0;
        while(lowerBound<=upperBound){
            curIndex= (lowerBound+upperBound)/2;
            if(array[curIndex]>target){
                upperBound= curIndex - 1;
            }else {
                lowerBound= curIndex + 1;
            }
        }
        return lowerBound;
    }
}
