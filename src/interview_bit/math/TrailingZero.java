package interview_bit.math;

public class TrailingZero {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(3125));
    }

    public static int trailingZeroes(int A) {
        int x = 1, c = 0;
        while (A / Math.pow(5, x) >= 1) {
            c = c + (int) (A / Math.pow(5, x));
            x = x + 1;
        }
        return c;
    }
}
