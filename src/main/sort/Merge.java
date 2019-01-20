package main.sort;

public class Merge {
    public static int[] arraymirro;

    public static void sort(int[] array){
        int lo = 0;
        int hi = array.length-1;
        sort(array, lo, hi);
    }

    //递归调用
    public static void sort(int[] array, int lo, int hi) {
        int mid = (lo+hi)/2;
        if(lo>=hi) return;
        sort(array, lo, mid);
        sort(array,mid+1 , hi);
        merge(array, lo, hi);
    }

    //把一个数组分成两半去排列，并且这两半已经排序好
    public static void merge(int[] array, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int length = hi - lo;
        arraymirro = new int[array.length];
        for(int i = lo; i<=hi; i++){
            arraymirro[i] = array[i];
        }

        for(int x=lo, i =lo, j = mid+1; x<=hi; x++){
            if(i>mid) array[x]= arraymirro[j++];
            else if(j>hi) array[x] =arraymirro[i++];
            else if(arraymirro[i]<arraymirro[j]) array[x] = arraymirro[i++];
            else array[x] = arraymirro[j++];
        }
    }
}
