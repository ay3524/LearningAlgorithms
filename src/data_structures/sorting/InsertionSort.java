package data_structures.sorting;

import static data_structures.sorting.Utils.printArray;

public class InsertionSort {

    public static void main(String... args) {
        int a[] = {7, 2, 4, 1, 5, 3};
        sort(a);
        //printArray(a);
    }

    private static void sort(int a[]) {
        int n = a.length;
        int hole, value;
        for (int i = 1; i < n - 1; i++) {
            printArray(a);
            value = a[i];
            hole = i;
            while (hole > 0 && a[hole - 1] > value) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = value;
        }
    }
}
