package interview_bit.arrays.c_bucketing;

import java.util.Arrays;

// Given an integer array,
// find if an integer p exists in the array such that the
// number of integers greater than p in the array equals to p
public class NobleInteger {
    public static void main(String... args) {
        int a[] = {7, 3, 16, 10};
        System.out.println(nobleIntegerOptimized(a));
    }

    public static int nobleIntegerOptimized(int arr[]) {
        Arrays.sort(arr);

        // Return a Noble element if present
        // before last.
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1])
                continue;

            // In case of duplicates, we
            // reach last occurrence here.
            if (arr[i] == ((n - 1) - i))
                return arr[i];
        }

        if (arr[n - 1] == 0)
            return arr[n - 1];

        return -1;
    }

    public static int nobleIntegerBruteForce(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] < arr[j])
                    count++;

            // If count of greater elements
            // is equal to arr[i]
            if (count == arr[i])
                return arr[i];
        }

        return -1;
    }
}
