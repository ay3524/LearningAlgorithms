package data_structures.string;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String st = "ashish";
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < st.length() - 1; i++) {
            hashSet.add(st.charAt(i));
        }
        System.out.println(hashSet);
    }
}
