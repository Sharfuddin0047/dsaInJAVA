package String;

import java.util.Scanner;

/*
WAJP to take a String input and count total
number of words in the String(Without using
split method)
*/
public class Q25 {
    public static int wordCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str=sc.nextLine();
        System.out.println("Word count is: "+wordCount(str));
        sc.close();
    }
}
