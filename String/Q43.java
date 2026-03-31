package String;

/*
WAJP to find weather a string is
PANAGRAM or not?
*/

import java.util.Scanner;

class Q43 {
    public static boolean isPangram(String str) {
        int[] charCount = new int[26];
        String str1 = str.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']++;
            }
        }


        for (int x : charCount) {
            if (x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1 = sc.nextLine();

        if (isPangram(str1)) {
            System.out.println("\"" + str1 + "\" is a Pangram");
        } else {
            System.out.println("\"" + str1 + "\" is NOT a Pangram");
        }
    }
}
