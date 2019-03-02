package interview_bit.arrays.b_simulation_array;

import java.util.ArrayList;
import java.util.List;

public class MaxNonNegativeSubArray {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(-7);
        list.add(2);
        list.add(3);
        System.out.println(maxNegSubArr(list));
    }

    //We need to keep track of maximum sum and the corresponding d_array
    //So we will have have maxSum, newSum and maxArray, newArray
    //We will keep on updating newSum and newArray until we get a -ve number
    //After getting a -ve number we will make the newSum as 0 and empty the newArray.
    //Now check maxSum with newSum and update the maxSum and maxArray
    public static List<Integer> maxNegSubArr(List<Integer> a) {
        long maxSum = 0;
        long newSum = 0;
        List<Integer> maxArray = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<>();
            }
            if ((maxSum <= newSum) && (newArray.size() > maxArray.size())){
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }
}
