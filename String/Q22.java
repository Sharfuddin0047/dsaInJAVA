package String;

/*WAJP to take a String input and print the sum
of all the numeric characters in the String. */
public class Q22 {
    public static int numericSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9')
                sum = sum + s.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numericSum("123456mhk"));
    }
}
