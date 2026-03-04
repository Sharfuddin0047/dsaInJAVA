package String;

import java.util.Scanner;

/*
Write a java program to print the biggest
numeric character from the given string.
Return -1 if there is no numeric characters.
*/
public class Q27 {
    public static int biggestNumericCharacter(String str) {
        int bigChar = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                bigChar = (int)Math.max(bigChar, ch - '0');
            }
        }
        return bigChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(biggestNumericCharacter(str));
        sc.close();
    }
}
