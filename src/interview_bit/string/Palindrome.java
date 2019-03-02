package interview_bit.string;

public class Palindrome {
    public static void main(String... args) {

        String st = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(st));
    }

    public static int isPalindrome(String st) {
        String st1 = "";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                //TODO make a string
                st1 = st1 + ch;
            }
        }

        if (getStringReverse(st1).equalsIgnoreCase(st1)) {
            return 1;
        } else {
            return 0;
        }
    }

    static String getStringReverse(String st){
        StringBuilder stringBuffer = new StringBuilder(st);
        return stringBuffer.reverse().toString();
    }
}
