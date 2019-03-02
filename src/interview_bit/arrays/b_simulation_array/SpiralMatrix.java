package interview_bit.arrays.b_simulation_array;

import interview_bit.random.InterviewBitUtils;

public class SpiralMatrix {
    public static void main(String... args) {
        int n = 3;
        InterviewBitUtils.print2DArray(generateMatrix(n), n);
    }

    private static int[][] generateMatrix(int A) {
        int[][] a = new int[A][A];
        int k = 0, l = 0, last_row = A - 1, last_col = A - 1, i;
        int x = 1;
        while (k <= last_row && l<=last_col) {
            for (i = l; i <= last_col; i++) {
                a[k][i] = x++;
            }
            k++;
            for (i = k; i <= last_row; i++) {
                a[i][last_col] = x++;
            }
            last_col--;
            if (k <= last_row) {
                for (i = last_col; i >= l; i--) {
                    a[last_row][i] = x++;
                }
                last_row--;
            }
            if (l <= last_col) {
                for (i = last_row; i >= k; i--) {
                    a[i][l] = x++;
                }
                l++;
            }
        }
        return a;
    }
}
