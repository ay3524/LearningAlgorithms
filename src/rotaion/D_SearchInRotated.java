package rotaion;

public class D_SearchInRotated {
	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
	     int n = arr.length;
	     int key = 4;
	     int i = performBinarySearch(arr, 0, n-1, key);
	     if (i != -1) 
	         System.out.println("Index: " + i);
	     else
	         System.out.println("Key not found");
	}

	private static int performBinarySearch(int a[], int start, int end, int key) {
		if (start > end) {
			return -1;
		} 
	     
	     int mid = (start+ end)/2;
	     if (a[mid] == key) {
	    	 return mid; 
	     }
	       
	     // If a[l...mid] is sorted
	     if (a[start] <= a[mid]){
	         // As this sub d_array is sorted, we can quickly check if key lies in half or other half
	         if (key >= a[start] && key < a[mid]) {
	        	 return performBinarySearch(a, start, mid-1, key); 
	         } else {
	        	 return performBinarySearch(a, mid+1, end, key);
	         }
	     }
	     // If a[l..mid] is not sorted,then a[mid... r] must be sorted
	     if (key > a[mid] && key <= a[end]) {
	    	 return performBinarySearch(a, mid+1, end, key);
	     } else {
	    	 return performBinarySearch(a, start, mid-1, key);	 
	     }
	}
}
