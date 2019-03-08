package main.sort;

public class Merge {
    /*    public static int[] arraymirro;

        public static void sort(int[] array) {
            int lo = 0;
            int hi = array.length - 1;
            sort(array, lo, hi);
        }

        //递归调用
        public static void sort(int[] array, int lo, int hi) {
            int mid = (lo + hi) / 2;
            if (lo >= hi) return;
            sort(array, lo, mid);
            sort(array, mid + 1, hi);
            merge(array, lo, hi);
        }

        //把一个数组分成两半去排列，并且这两半已经排序好
        public static void merge(int[] array, int lo, int hi) {
            int mid = (lo + hi) / 2;
            int length = hi - lo;
            arraymirro = new int[array.length];
            for (int i = lo; i <= hi; i++) {
                arraymirro[i] = array[i];
            }

            for (int x = lo, i = lo, j = mid + 1; x <= hi; x++) {
                if (i > mid) array[x] = arraymirro[j++];
                else if (j > hi) array[x] = arraymirro[i++];
                else if (arraymirro[i] < arraymirro[j]) array[x] = arraymirro[i++];
                else array[x] = arraymirro[j++];
            }
        }*/
    public void sort(int[] array) {
        int l = 0;
        int r = array.length - 1;
        Sort(array, l, r);
    }

    public void Sort(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;
        Sort(array, l, mid);
        Sort(array, mid + 1, r);
        if (array[mid] > array[mid + 1])
            mergeSort(array, l, mid, r);
    }

    public void mergeSort(int[] array, int l, int mid, int r) {
        int[] aux = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            aux[i - l] = array[i];
        }

        int i = l;
        int j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (j < mid - 1) {
                aux[k] = array[i];
                i++;
            }
            if (i > mid) {
                aux[k] = array[j];
                j++;
            }
            if (array[i] <= array[j]) {
                aux[k] = array[i];
                i++;
            } else {
                aux[k] = array[j];
                j++;
            }
        }

        for (i = l; i <= r; i++) {
            array[i - l] = aux[i];
        }
    }
}
