package interview_bit.random;

import java.util.Arrays;

public class Factors {
    public static void main(String... args) {
        int n = 36;
//        InterviewBitUtils.print1DArray(factors(n));
        printDivisors(36);
    }

    private static void printDivisors(int n) {
        // Note that this loop runs till square root
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    // If divisors are equal, print only one
                    System.out.println(i + " ");
                } else {
                    // Otherwise print both
                    System.out.println(i + " " + (n / i));
                }
            }
        }
    }

    private static int[] factors(int n) {
        int x = (int) Math.sqrt(n);
        int a[] = new int[n];
        for (int i = 1; i <= x; i++) {
            if (n % i == 0) {
                a[i] = i;
                if (i != x) {
                    a[i] = n / i;
                }
            }
        }
        Arrays.sort(a);
        return a;
    }
}
