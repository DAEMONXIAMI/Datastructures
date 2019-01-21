package main.sort;

public class Quick {
    public static void sort(int[] array) {
        sort(array, 0, array.length-1);
    }

    public static void sort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(array, lo, hi);

        sort(array, lo, j-1);
        sort(array, j+1,hi);
    }

    public static int partition(int[] array, int lo, int hi) {
        int i = lo;
        int j = hi+1;
        int comp = array[lo];

        while (true) {
            while (comp > array[++i]) {
                if(i==hi) break;
            }
            while (comp < array[--j]) {
                if(j==lo) break;
            }

            if(i>=j)
                break;

            int temp;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        int temp;
        temp = array[lo];
        array[lo] = array[j];
        array[j] =temp;

        return j;
    }
}
