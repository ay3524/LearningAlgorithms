package rotaion;

/**
 * 1.Program for d_array rotation
 * Program to rotate an a[] to left or right by 'x' factor
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 *
 * @author Ashish Yadav
 */
public class A_LeftRightRotate {
    public static void main(String[] args) {
        int[] anArray = {1, 2, 3, 4, 5, 6, 7};
        int x = 57;
        int pos;
        int size = anArray.length;
        if (x >= size) {
            x = x % size;
        }
        int[] secondArray = new int[size];

        for (int i = 0; i < anArray.length; i++) {

            //Rotating to the left by n is the same as rotating to the right by length-n.

            //Left rotation
            pos = (i + (size - x)) % size;
            secondArray[pos] = anArray[i];

            //Right rotation
//        pos = (i + x) % size;
//        secondArray[pos] = anArray[i];

            //Below code is just for visualizing and not lead to O(n*n)
            for (int k = 0; k < secondArray.length; k++) {
                System.out.print(secondArray[k] + " ");
            }
            System.out.println();
        }

        //Below code can be used to print the final d_array only
//    for (int i = 0; i < secondArray.length; i++){
//        System.out.print(secondArray[i] + " ");
//    }

    }
}
