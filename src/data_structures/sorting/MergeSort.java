package data_structures.sorting;

import static data_structures.sorting.Utils.printArray;

public class MergeSort {
    public static void main(String... args) {
        int a[] = {7, 2, 4, 1, 5, 3, 8};
        printArray(a);
        sort(a);
        printArray(a);
    }

    private static void sort(int a[]) {
        int n = a.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            //If you don't consider "i-mid" then you may fall in ArrayIndexOutOfBound
            //Because the loop is supposed to go till n
            //But the size of "right[]" is smaller than n
            right[i - mid] = a[i];
        }

        sort(left);
        sort(right);
        merge(left, right, a);
    }

    private static void merge(int left[], int right[], int a[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i = i + 1;
                k = k + 1;
            } else {
                a[k] = right[j];
                j = j + 1;
                k = k + 1;
            }
        }

        while (i < nL) {
            a[k] = left[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < nR) {
            a[k] = right[j];
            j = j + 1;
            k = k + 1;
        }
    }
}
