package interview_bit.arrays.g_bucketing_or_sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);
        System.out.print(repeatedNumber(list));
    }

    //The idea is we will keep adding number to HashMap's key
    //Once we find that it is the same key ..BINGO :)
    public static int repeatedNumber(final List<Integer> a) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (!hashMap.containsKey(a.get(i))) {
                hashMap.put(a.get(i), 1);
            } else {
                return a.get(i);
            }
        }
        return -1;
    }
}
