package interview_bit.math;

public class HammingDistance {
    public static void main(String... args) {
        int a[] = {2, 4, 6};
        System.out.println(hammingDistanceBruteForce(a));

    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    private static int hammingDistanceBruteForce(final int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] != A[j]) {
                    x += hammingDistanceBetweenInts(A[i], A[j]);
                }
            }
        }
        return x;
    }

    private static int hammingDistanceBetweenInts(int n1, int n2) {
        int x = n1 ^ n2;
        int setBits = 0;

        while (x > 0) {
            setBits += x & 1;
            x >>= 1;
        }

        return setBits;
    }

    private int hammingDistance(final int[] A) {
        int n = A.length;
        int dist = 0;
        for (int i = 0; i < 31; i++) {
            int oneCount = 0;
            for (int j = 0; j < n; j++) {
                int num = A[j];
                oneCount += (num & 1 << i) != 0 ? 1 : 0;
            }
            int zeroCount = n - oneCount;
            dist += (2L * oneCount * zeroCount) % 1000000007;
            dist = dist % 1000000007;
        }
        return dist;
    }

}
