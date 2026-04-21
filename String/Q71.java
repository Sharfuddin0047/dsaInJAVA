package String;

import java.util.Scanner;

public class Q71 {
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = convertToUpperCase(input);
        System.out.println("Converted string: " + result);

        sc.close();
    }
}
