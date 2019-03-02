package interview_bit.arrays.a_array_math;

public class C_MaxSumContiguousArray {
    public static void main(String... args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print(maxSubArray(a));
    }

    public static int maxSubArray(int A[]) {
        int max_so_far = A[0];
        int curr_max = A[0];

        for (int i = 1; i < A.length; i++) {
            curr_max = Math.max(A[i], curr_max + A[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
