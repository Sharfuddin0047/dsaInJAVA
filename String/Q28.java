package String;

import java.util.Scanner;

public class Q28 {
    public static int secondHighest(String s) {
         int largest = -1;
        int secLarg = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';

                if (digit > largest) {
                    secLarg = largest;
                    largest = digit;
                } else if (digit < largest && digit > secLarg) {
                    secLarg = digit;
                }
            }
        }
        return secLarg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println(secondHighest(str));
        sc.close();
    }
}
