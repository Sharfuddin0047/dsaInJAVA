package String;

import java.util.Scanner;

/*A password manager wants to create new passwords using two strings given by the
user, then combined to create a harder-to- guess combination. Given two strings,
interleave the characters of the strings to create a new string. Beginning with an
empty string, alternately append a character from string a and from string b. If one
of the strings is exhausted before the other, append the remaining letters from the
other string all at once. The result is the new password.

Example :
If a = ‘hackerrank’ and b = ‘mountain’,
The result is hmaocuknetrariannk. */
public class Q20 {
    public static String combPassword(String s1, String s2) {
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i<s1.length() && i<s2.length()) {
            sb = sb.append(s1.charAt(i)).append(s2.charAt(i));
            i++;
        }

        while(i<s1.length()) {
            sb.append(s1.charAt(i));
            i++;
        }

        while(i<s2.length()) {
            sb.append(s2.charAt(i));
            i++;
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1=sc.next();
        System.out.println("Enter second String: ");
        String s2=sc.next();
        System.out.println("The result is "+combPassword(s1, s2));
        sc.close();
    }
}
