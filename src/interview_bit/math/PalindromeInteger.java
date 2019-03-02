package interview_bit.math;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-78987));
    }

    public static int isPalindrome(int A) {
        if (A < 0) {
            return 0;
        }
        int k = A, x, y = 0;
        while (A != 0) {
            x = A % 10;
            y = y * 10 + x;
            A = A / 10;
        }
        if (y == k) {
            return 1;
        }
        return 0;
    }
}
