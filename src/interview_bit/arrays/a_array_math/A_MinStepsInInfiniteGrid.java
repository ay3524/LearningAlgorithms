package interview_bit.arrays.a_array_math;

public class A_MinStepsInInfiniteGrid {
    public static void main(String... args) {
        int a[] = {4, 1, 4, 10};
        int b[] = {6, 2, 5, 12};
        System.out.print("" + coverPoints(a, b));
    }

    public static int coverPoints(int[] A, int[] B) {
        int size = A.length;
        int x = 0;
        for (int i = 0; i < size - 1; i++) {
            x = x + shortestPath(A[i], B[i], A[i + 1], B[i + 1]);
        }
        return x;
    }

    public static int shortestPath(int a, int b, int c, int d) {
        int dx = Math.abs(a - c);
        int dy = Math.abs(b - d);
        return Math.max(dx, dy);
    }
}
