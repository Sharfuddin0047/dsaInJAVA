package String;

/*WAJP to take a String input and print sum of all
the even numeric characters in the String. */
public class Q23 {
     public static int numericSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9' && (c-'0')%2==0)
                sum = sum + s.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numericSum("123456mhk"));
    }
}
