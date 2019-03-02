package data_structures.sorting.problem_solving;

import static data_structures.sorting.Utils.printArray;

public class RotateTest {

    public static int[] rotate(int a[], int x) {
        int size = a.length;
        if (x >= size) {
            x = x % size;
        }
        int aux[] = new int[size];
        int pos;
        for (int i = 0; i < size; i++) {
            //Left rotation
//            pos = (i + (size - x)) % size;
            //Right rotation
            pos = (i + x) % size;
            aux[pos] = a[i];
        }
        return aux;
    }

    public static void main(String... args) {
        int a[] = {14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35};
        int rotation = 56;

        printArray(a);
        printArray(rotate(a, rotation));

        //Below code is for ArrayList
//        Integer b[] = {14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35};
//        List<Integer> ret = Arrays.asList(b);
//        ArrayList<Integer> arrayList = new ArrayList<>(ret);
//        rotateArray(arrayList, rotation);
//
    }

    //Below code is for ArrayList
//    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
//        ArrayList<Integer> ret = new ArrayList<>();
//        int size = A.size();
//        if (B >= size) {
//            B = B % size;
//        }
//        for (int i = 0; i < A.size(); i++) {
//            ret.add(A.get((i + B)%size));
//        }
//        System.out.println(ret);
//        return ret;
//    }
}
