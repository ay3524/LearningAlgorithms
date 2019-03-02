package rotaion;

/**
 * 2.Reversal algorithm for d_array rotation
 * Program to rotate an a[] to left by 'x' factor
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 * @author Ashish Yadav
 * */
public class B_RotateLeftReversalAlgo {
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5, 6, 7};
    int x = 2;
    int size = a.length;
    
    if(x != 0) {
    	 rvereseArray1(a, 0, x-1);
    	 System.out.println();
    	 //Don't pass x-1 below, pass x because x-1 was already used above
    	 rvereseArray1(a, x, size-1);
    	 System.out.println();
    	 rvereseArray1(a, 0, size-1);
    } else {
    	//Now if the rotation factor is 0 then we will simply run reverse d_array
    	rvereseArray1(a, 0, size-1);
    }
}

public static void printVisualizeArray(int b[]) {
	for (int k = 0; k < b.length; k++){
        System.out.print(b[k] + " ");
    }
    System.out.println();
}

/*Function to reverse d_array from start index to end index*/
public static void rvereseArray1(int arr[], int start, int end){
    int temp;
    while (start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        printVisualizeArray(arr);
    }
  }
}