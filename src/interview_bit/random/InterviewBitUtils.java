package interview_bit.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewBitUtils {
    public static void print2DArray(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void print1DArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] convertListToArray(List<Integer> list) {
        int a[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }

    public static List<Integer> convertArrayToList(int a[]) {
        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }
}
