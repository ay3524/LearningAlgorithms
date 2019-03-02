package common_algos;

public class Test {

    private static int findSubString(String str) {
       int median = str.length()/2;
       String x = "";
       String y = "";
       int count = 0;

       for (int i = 0; i < median; i++){
           x = x + str.charAt(i);
       }

        for (int j = median; j < str.length(); j++){
            y = y + str.charAt(j);
        }

        for(int i = 0; i < median; i++){
            for (int j = y.length() - 1 ; j > 0 ; j--){
                if (x.charAt(i) == y.charAt(j)){
                    count = count + 2;
                    System.out.println(count);
                }else if (x.charAt(i) == x.charAt(i + 1)){
                    count++;
                    System.out.println(count);
                }
            }
        }
        return str.length() - count;
    }

    // Driver code
    public static void main(String args[]) {
        String str = "aabcccabba";
        int i = findSubString(str);
        System.out.println(i);
    }
}
