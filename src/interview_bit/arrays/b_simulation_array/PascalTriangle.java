package interview_bit.arrays.b_simulation_array;

public class PascalTriangle {
    public static void main(String... args) {
        print(solve(5), 5);
    }

    public static int[][] solve(int A) {
        int a[][] = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < i + 1; j++) {
//                System.out.print("i :" + i + " ");
//                System.out.print("j :" + j + " ");
                a[i][j] = calculateBinomialCoeff(i, j);
//                System.out.print("Coeff : " + calculateBinomialCoeff(i, j));
                //For ith row we need i+1 items
                //1
                //1 1
                //1 2 1
                //1 3 3 1
//                a[i][j] = i;
            }
            System.out.println();
        }
        return a;
    }

    public static void print(int a[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static int calculateBinomialCoeff(int n, int r) {
        // n!/(r! * (n-r)!)
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
