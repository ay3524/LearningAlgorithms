package interview_bit.math;

public class PowerOfTwoIntegers {
    public static void main(String... args) {
//        System.out.println();
        System.out.println(isPower(96059601));
    }

    private static int isPowerBruteForce(int A) {
//        double x = Math.log(2) + Math.log(2);
//        System.out.println(x);
        double x = A;
        for (int i = 2; i < A; i++) {
            for (int j = 1; j < A; j++) {
                if (Math.pow(i, j) == x)
                    System.out.println(i + " " + j);
            }
        }
        return 0;
    }

    private static boolean isPower(int n) {

        for (int x = 2; x <= Math.sqrt(n); x++) {
            int y = 2;

            double p = Math.pow(x, y);

            while (p <= n && p > 0) {
                p = Math.pow(x, y);
                if (p == n) {
                    return true;
                }
                y++;
            }
        }
        return false;
    }
}
