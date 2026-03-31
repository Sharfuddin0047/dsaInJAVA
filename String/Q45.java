package String;

import java.util.Scanner;

/*
WAJP To Check If A String Is Substring Of
Another String or NOT.
*/
class Q45 {
    public static boolean isSubstring(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        if (m > n)
            return false;

        for (int i = 0; i < n; i++) {
            int j = 0;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring to check: ");
        String subStr = sc.nextLine();

        if (isSubstring(mainStr, subStr)) {
            System.out.println("\"" + subStr + "\" is a substring of \"" + mainStr + "\"");
        } else {
            System.out.println("\"" + subStr + "\" is NOT a substring of \"" + mainStr + "\"");
        }
    }
}