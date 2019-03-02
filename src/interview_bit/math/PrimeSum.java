package interview_bit.math;

import java.util.ArrayList;

public class PrimeSum {
    public static void main(String... args) {
        System.out.println(primesum(6));
    }

    public static ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < A; i ++) {
            for (int j = i; j < A; j ++) {
                if (i <= j && isPrime(i) && isPrime(j) && (i + j == A)) {
                    arrayList.add(i);
                    arrayList.add(j);
                }
            }
        }
        return arrayList;
    }

    public static boolean isPrime(int A) {
        int upperLimit = (int) (Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) {
                return false;
            }
        }
        return true;
    }
}
