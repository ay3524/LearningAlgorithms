package common_algos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int start = 0;
        int end = a.length - 1;
        //Element to search
        int x = -5;
        System.out.println("Position By Iteration = " + binarySearchByIteration(a, start, end, x));
        System.out.println("Position By Recursion = " + binarySearchByRecursion(a, start, end, x));
    }

    private static int binarySearchByIteration(int[] arr, int start, int end, int x) {
        int mid;

        //There must be some exit condition apart from a[mid] == x because what if the element is not found!!
        //When start == end then we have only one element
        //When start < end becomes false it means we have exhausted the search space
        while (start <= end) {
            System.out.println("Counting Passes");
            mid = (start + end) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half 
            if (arr[mid] < x)
                start = mid + 1;

                // If x is smaller, ignore right half
            else
                end = mid - 1;
        }
        return -1;
    }

    private static int binarySearchByRecursion(int a[], int start, int end, int x) {
        int mid = (start + end) / 2;
        System.out.println("Counting Passes");
        if (start <= end) {
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                return binarySearchByRecursion(a, mid + 1, end, x);
            } else if (a[mid] > x) {
                return binarySearchByRecursion(a, start, mid - 1, x);
            }
        }
        return -1;
    }
}
