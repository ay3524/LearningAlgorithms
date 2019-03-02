package interview_bit.random;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String... args) {
        int a = 4;
        int b = 7;
//        System.out.println(a & b); // prints 4

//        System.out.println(fizzBuzz(15));
        System.out.println(findDigitsInBinary(20));
//meaning in an 32 bit system
// 00000000 00000000 00000000 00000100
// 00000000 00000000 00000000 00000111
// ===================================
// 00000000 00000000 00000000 00000100
    }

    public static ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> a = new ArrayList();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a.add("FizzBuzz");
            } else if (i % 3 == 0) {
                a.add("Fizz");
            } else if (i % 5 == 0) {
                a.add("Buzz");
            } else {
                a.add(String.valueOf(i));
            }
        }
        return a;
    }

    public static String findDigitsInBinary(int A) {
        if (A == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int x;
        while (A != 0) {
            x = A % 2;
            stringBuffer.append(x);
            A = A / 2;
        }
        return stringBuffer.reverse().toString();
    }
}
