package data_structures.sorting;

import static data_structures.sorting.Utils.printArray;

public class QuickSort {
    public static void main(String... args) {
        int a[] = {7, 2, 4, 1, 5, 3};
        printArray(a);
        sort(a, 0, a.length - 1);
        printArray(a);
    }

    public static void sort(int a[], int start, int end) {
        //It will reach a stage when end will be -1
        if (start < end) {
            int pIndex = partition(a, start, end);
            sort(a, start, pIndex - 1);
            sort(a, pIndex + 1, end);
        }
    }

    public static int partition(int a[], int start, int end) {
        int pivot = a[end];
        int pIndex = start;
        int temp;
        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                //swap(a[pIndex],a[i]);
                temp = a[pIndex];
                a[pIndex] = a[i];
                a[i] = temp;
                pIndex++;
            }
        }
        //swap(a[pIndex],a[end]);
        temp = a[pIndex];
        a[pIndex] = a[end];
        a[end] = temp;
        return pIndex;
    }
}
