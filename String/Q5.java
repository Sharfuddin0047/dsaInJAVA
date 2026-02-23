package String;

import java.util.Scanner;

/*WAJP to take a String input and count all the
space characters, uppercase, lowercase,
numeric, special characters in the String. */
public class Q5 {
    public static void counter(String s) {
        int space = 0;
        int uppercase = 0;
        int lowercase = 0;
        int numericDigit = 0;
        int specialCharacter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 32) {
                space++;
            } else if (c >= 65 && c <= 90) {
                uppercase++;
            } else if (c >= 97 && c <= 122) {
                lowercase++;
            } else if (c >= 48 && c <= 57) {
                numericDigit++;
            } else if (c >= 33 && c <= 64) {
                specialCharacter++;
            }
        }

        System.out.println("space count = " + space);
        System.out.println("uppercase count = " + uppercase);
        System.out.println("lowercase count = " + lowercase);
        System.out.println("numericDigit count = " + numericDigit);
        System.out.println("specialCharacter count = " + specialCharacter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        counter(str);
        sc.close();
    }
}
