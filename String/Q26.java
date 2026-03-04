package String;

import java.util.Scanner;

/*
WAJP to take a String input and count total
number of words in the String(Using split
method)
*/
public class Q26 {
    public static int wordCount(String str) {
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str = sc.nextLine();
        System.out.println("Word count is: " + wordCount(str));
        sc.close();
    }
}
