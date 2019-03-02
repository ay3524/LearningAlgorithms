package interview_bit.random;

import java.util.*;

/*The Monk wants to buy some cities.
 * To buy two cities, he needs to buy the road connecting those two cities.
 * Now, you are given a list of roads, bought by the Monk.
 * You need to tell how many cities did the Monk buy.*/

/*Input:
 *First line contains an integer T, denoting the number of test cases.
 *The first line of each test case contains an integer E, denoting the number of roads.
 *The next E lines contain two space separated integers X and Y,
 * denoting that there is an road between city X and city Y.*/

//Output:
//For each test case, you need to print the number of cities the Monk bought.
//
//Constraint:
//1 <= T <= 100
//1 <= E <= 1000
//1 <= X, Y <= 10000
class MonkProblem {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int E = s.nextInt();
            Set<Integer> hs = new HashSet<>();
            for (int i = 0; i < E; i++) {
                hs.add(s.nextInt());
                hs.add(s.nextInt());
            }
            System.out.println(hs);
            System.out.println(hs.size());
            t--;
        }
    }
}