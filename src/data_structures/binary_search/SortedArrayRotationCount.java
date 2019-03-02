package data_structures.binary_search;

public class SortedArrayRotationCount {
    public static void main(String[] args) {
        int[] a = {11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println(sortedArrayRotationCount(a));
    }

    private static int sortedArrayRotationCount(int[] a) {
        int n = a.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            if (a[low] <= a[high]) {
                return low;
            }
            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (a[mid] <= a[next] && a[mid] <= prev) {
                return mid;
            } else if (a[mid] <= a[high]) {
                high = mid + 1;
            } else if (a[mid] >= a[low]) {
                low = mid - 1;
            }
        }
        return -1;
    }
}
