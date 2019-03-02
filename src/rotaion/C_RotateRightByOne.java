package rotaion;
/**
 * 3.Program to cyclically rotate an d_array by one
 * Clockwise d_array rotation by one factor
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 * @author Ashish Yadav
 * */
public class C_RotateRightByOne {
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5, 6, 7};
    int size = a.length;
    int last = a[size-1];
    for(int i = size-1 ; i > 0 ; i--) {
    	a[i] = a[i-1];
    	printVisualizeArray(a);
    }
    a[0]=last;
    printVisualizeArray(a);
}
public static void printVisualizeArray(int b[]) {
	for (int k = 0; k < b.length; k++){
        System.out.print(b[k] + " ");
    }
    System.out.println();
}
}
