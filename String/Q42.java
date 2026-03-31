package String;
/*
WAJP to find weather a string is ANAGRAM or
not?
*/

import java.util.Scanner;

public class Q42 {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 != l2) {
            return false;
        }

        int[] charCount = new int[26];
        for (int i = 0; i < l1; i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']++;
            }
        }

        for (int i = 0; i < l2; i++) {
            char ch = str2.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']--;
            }
        }

        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.next();
        System.out.print("Enter Second String: ");
        String str2 = sc.next();

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagram");
        }
    }
}
