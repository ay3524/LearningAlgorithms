package data_structures.binary_search;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 3, 5, 7};
        System.out.println(lastOccurrence(a, 3));
        System.out.println(firstOccurrence(a, 3));
    }

    public static int lastOccurrence(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int result = -1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == x) {
                result = mid;
                //Go on searching towards right(higher indices)
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int firstOccurrence(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int result = -1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == x) {
                result = mid;
                //Go on searching towards left(lower indices)
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
