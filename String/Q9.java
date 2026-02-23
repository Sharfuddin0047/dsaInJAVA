package String;

import java.util.Scanner;

/*WAJP to take a String input and segregate
alphabets and numeric digits in any order.
i/p: “a4cdx37d2b”
o/p: “dcaxdb4372” */
public class Q9 {
    public static void segregateString(String str) {
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                s1.append(c);
            } else if (c >= '0' && c <= '9') {
                s2.append(c);
            }
        }
        System.out.println("" + s1 + s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        segregateString(str);
        sc.close();

    }
}
