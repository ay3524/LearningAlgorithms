package interview_bit.arrays.a_array_math;

public class F_Flip {
    public static void main(String... args) {
        String s = "010";
        flip(s);
    }

    public static int[] flip(String a) {
        char ch[] = a.toCharArray();
        int size = ch.length;
//        char temp[] = new char[size];
        String temp = null;
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length - 1; i++) {

            }
            //one for i
            //1,1 1,2 1,3
            //2,1x 2,2 2,3
            //3,1x 3.2x 3.3
            Integer.parseInt(a.charAt(i) + "");
            //other with i+1

        }
        return null;
    }
}
