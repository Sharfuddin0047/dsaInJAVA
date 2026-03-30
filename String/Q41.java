package String;

import java.util.Arrays;


/*

Given a string of Size N containing digits from 1
to N+1 where any one digit is missing.
Print the missing digit.
String s=“36521”;
Output: 4
*/
public class Q41 {
    public static void missingDigit(String str) {
        char[] ch=str.toCharArray();
        Arrays.sort(ch);

        for(int i=0; i<ch.length; i++) {
            if(ch[i] - '0' != i+1) {
                System.out.println((i+1) + " is MIssing");
                return;
            }
        }

        System.out.println((ch.length + 1) + " is Missing");
    }
    public static void main(String[] args) {
        String s = "36521";
        missingDigit(s);
    }
}
