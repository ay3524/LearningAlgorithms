package interview_bit;

public final class Test {

    public static void main(String... args) {
        int[] a = {1, 2, 3, 4, 5};
        productArray(a, a.length);
    }

    static void productArray(int[] a, int N) {

        //For ex. a[] = {1, 2, 3, 4, 5}

        int[] prodArray = new int[N];

        // Get the products below the current index
        int p = 1, i = 0;
        while (i < N) {
            prodArray[i] = p;
            p *= a[i];
            i++;
        }

        //Now prodArray[] = {1 1 2 6 24}

        printVisualizeArray(prodArray);

        // Get the products above the current index
        p = 1;
        i = N - 1;
        while (i >= 0) {
            prodArray[i] *= p;
            p *= a[i];
            i--;
        }

        //Now prodArray[] = {120 60 40 30 24}

        System.out.println(max(prodArray));
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printVisualizeArray(int[] b) {
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");
        }
        System.out.println();
    }
}
