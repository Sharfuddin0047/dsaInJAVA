package String;

import java.util.Scanner;

/*WAJP to check if a string contains only digits. */
public class Q16 {
    public static void containOnlyDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                System.out.println("Contains other characters also");
                return;
            }
        }
        System.out.println("Contains Numeric characters only");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        containOnlyDigit(str);
        sc.close();
    }
}
