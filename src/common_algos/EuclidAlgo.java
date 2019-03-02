package common_algos;

/**
 * Program to find GCD of two positive integers
 *
 * @author Ashish Yadav
 */
public class EuclidAlgo {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
    }

    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        int r = m % n;
        if (r == 0) {
            return n;
        } else {
            return gcd(n, r);
        }
    }
}
