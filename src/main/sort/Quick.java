package main.sort;

public class Quick {
    public static void sort(int[] array) {
    }

    /*    public static void sort(int[] array) {
                sort(array, 0, array.length - 1);
            }
    
            public static void sort(int[] array, int lo, int hi) {
                if (lo >= hi) {
                    return;
                }
                int j = partition(array, lo, hi);
    
                sort(array, lo, j - 1);
                sort(array, j + 1, hi);
            }
    
            public static int partition(int[] array, int lo, int hi) {
                int i = lo;
                int j = hi + 1;
                int comp = array[lo];
    
                while (true) {
                    while (comp > array[++i]) {
                        if (i == hi) break;
                    }
                    while (comp < array[--j]) {
                        if (j == lo) break;
                    }
    
                    if (i >= j)
                        break;
    
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    
                int temp;
                temp = array[lo];
                array[lo] = array[j];
                array[j] = temp;
    
                return j;
            }*/
/*    public void quickSort(int[] array) {
        int l = 0;
        int r = array.length - 1;
        quickSort(array, l, r);
    }

    public void quickSort(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(array, l, r);
        quickSort(array, l, p - 1);
        quickSort(array, p + 1, l);
    }

    public int partition(int[] array, int l, int r) {
        int v = array[l];
        int temp = 0;
        //接下来要做的是 array[l+1...j] < v; arr[j+1...l] >= v
        int j =l ;//j的位置处于要排序的头部以前，是一个数组外的位置,j表示当前小于v的最后一个数的下标，i表示下一个要比较的数
        for (int i = l + 1; i <= r; i++) {
            if (array[i] < v) {
                temp = array[i];
                array[i] = array[j+1];
                array[j+1] = temp;
                j++;
            }
        }
        //将放在头部的v和j位置的元素交换
        temp = array[j];
        array[j] = v;
        return j;
    }*/
    public void quick(int[] array) {
        int lo = 0;
        int hi = array.length - 1;
        quick(array, lo, hi);
    }

    private void quick(int[] array, int lo, int hi) {
        if(lo > hi) return;

        int j = partition(array, lo, hi);
        quick(array, lo, j - 1);
        quick(array, j + 1, hi);
    }

    private int partition(int[] array, int lo, int hi) {
        int value = array[lo];
        int j = lo;
        for (int i = lo + 1; i <= hi; i++) {
            if (array[i] > value) {
                swap(array[i], array[j + 1]);
                j++;
            }
        }
        swap(array[lo], array[j]);
        return j;
    }

    private void swap(int i, int i1) {
        int temp;
        temp = i;
        i = i1;
        i1 = temp;
    }

}
