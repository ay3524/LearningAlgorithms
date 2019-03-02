package interview_bit.arrays.a_array_math;

import java.util.ArrayList;
import java.util.List;

public class B_AddOneToNumber {
    public static void main(String... args) {
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(9);
        a.add(9);
        System.out.println(plusOne(a));

        //Steps for solving
        //1 : Remove all the frontal zeroes from the list(ex. 00099 becomes 99)
        //2 : Loop from last digit because 1 will be added to the last one
            //2.1 : Calculate sum by adding 1 to this loop element
            //2.2 : Set the last element as 0(if sum=10) or n(n<10)(if sum<10)
            //2.3 : We only want carry as 1 for next iteration if sum=10 otherwise 0
            //2.4 : If carry will be 0 we will break
        //3 : If the carry was 1(After iteration) then we will be adding a extra element as 1 to the front
    }

    private static List<Integer> plusOne(List<Integer> A) {
        int i = 0;
        //remove zeroes at the front
        while (i < A.size() - 1 && A.get(i) == 0) {
            A.remove(i);
        }

        System.out.println(A);

        int sum, carry = 1;

        // Traverse from last digit
        for (int j = A.size() - 1; j >= 0; j--) {
            //Create sum for ex. a=99 then sum 9+1(carry) = 10
            //Create sum for ex. a=78 then sum 8+1(carry) = 9
            sum = A.get(j) + carry;
            //If the sum is 10 then last digit will be 0 because 10%10 = 0
            //If the sum < 10 then last digit will be that number ex. 9%10 = 9
            A.set(j, sum % 10);
            //if sum is 10 then carry will be 1
            //if sum < 10 then carry will be 0
            carry = sum / 10;

            // no need of further processing if carry is zero
            if (carry == 0) {
                break;
            }
        }

        // if carry is still left
        if (carry != 0) {
            A.add(0, carry);
        }
        return A;
    }
}
