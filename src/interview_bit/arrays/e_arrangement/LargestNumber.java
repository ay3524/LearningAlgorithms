package interview_bit.arrays.e_arrangement;

import java.util.*;

public class LargestNumber {

    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(34);
        list.add(5);
        list.add(9);

        //9534330
        System.out.print(printLargest(list));
    }

    static String printLargest(final List<Integer> arr) {

        Collections.sort(arr, new Comparator<Integer>() {

            // A comparison function which is used by
            // sort() in printLargest()
            @Override
            public int compare(Integer X, Integer Y) {

                // first append Y at the end of X
                String Xs = String.valueOf(X);
                String Ys = String.valueOf(Y);
                String XY = Xs + Ys;

                // then append X at the end of Y
                String YX = Ys + Xs;

                // Now see which of the two formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = arr.iterator();

        String st = "";
        while (it.hasNext()) {
            st = st.concat(String.valueOf(it.next()));
        }

        if (st.charAt(0) == '0') {
            return "0";
        } else {
            return st;
        }
    }
}
