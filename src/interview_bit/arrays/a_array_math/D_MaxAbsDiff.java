package interview_bit.arrays.a_array_math;

public class D_MaxAbsDiff {
    public static void main(String... args) {
        int a[] = {-70, -64, -6, -56, 64, 61, -57, 16, 48, -98};
        System.out.print(maxArrOptimal(a));
    }

    public static int maxArrBruteForce(int[] A) {
        int sum = 0, t;

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                t = Math.abs(A[i] - A[j]) + Math.abs(i - j);
                sum = Math.max(t, sum);
            }
        }
        return sum;
    }

    public static int maxArrOptimal(int[] array) {
        // max and min variables as described
        // in algorithm.
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            // Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, array[i] + i);
            min1 = Math.min(min1, array[i] + i);
            max2 = Math.max(max2, array[i] - i);
            min2 = Math.min(min2, array[i] - i);
        }

        // Calculating maximum absolute difference.
        return Math.max(max1 - min1, max2 - min2);
    }

    //We are using math's absolute value property

    //Case 1: A[i] > A[j] and i > j
    //|A[i] - A[j]| = A[i] - A[j]
    //|i -j| = i - j
    //hence, f(i, j) = (A[i] + i) - (A[j] + j)
    //
    //Case 2: A[i] < A[j] and i < j
    //|A[i] - A[j]| = -(A[i]) + A[j]
    //|i -j| = -(i) + j
    //hence, f(i, j) = -(A[i] + i) + (A[j] + j)
    //
    //Case 3: A[i] > A[j] and i < j
    //|A[i] - A[j]| = A[i] - A[j]
    //|i -j| = -(i) + j
    //hence, f(i, j) = (A[i] - i) - (A[j] - j)
    //
    //Case 4: A[i] < A[j] and i > j
    //|A[i] - A[j]| = -(A[i]) + A[j]
    //|i -j| = i - j
    //hence, f(i, j) = -(A[i] - i) + (A[j] - j)

    //On the basis of above

    //1. Calculate the value of A[i] + i and A[i] – i for every element of the d_array while traversing through the d_array.
    //
    //2. Then for the two equivalent cases, we find the maximum possible value. For that, we have to store minimum and maximum values of expressions A[i] + i and A[i] – i for all i.
    //
    //3. Hence the required maximum absolute difference is maximum of two values i.e. max((A[i] + i) – (A[j] + j)) and max((A[i] – i) – (A[j] – j)). These values can be found easily in linear time.
    //     a. For max((A[i] + i) – (A[j] + j)) Maintain two variables max1 and min1 which will store maximum and minimum values of A[i] + i respectively. max((A[i] + i) – (A[j] + j)) = max1 – min1
    //     b. For max((A[i] – i) – (A[j] – j)). Maintain two variables max2 and min2 which will store maximum and minimum values of A[i] – i respectively. max((A[i] – i) – (A[j] – j)) = max2 – min2

}
