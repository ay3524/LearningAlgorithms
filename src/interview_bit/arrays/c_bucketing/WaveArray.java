package interview_bit.arrays.c_bucketing;

import interview_bit.random.InterviewBitUtils;

public class WaveArray {
    public static void main(String... args) {
        int a[] = {5, 1, 3, 2, 4};
        waveArray(a);
        InterviewBitUtils.print1DArray(a);
    }

    private static void waveArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i += 2) {

            if (i > 0 && a[i] < a[i - 1]) {
                swap(a, i, i - 1);
            }

            if (i < n - 1 && a[i] < a[i + 1]) {
                swap(a, i, i + 1);
            }
        }
    }

    // A utility method to swap two numbers.
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
