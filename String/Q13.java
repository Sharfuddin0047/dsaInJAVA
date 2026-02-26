package String;

import java.util.Scanner;

/*WAJP to take a String input and check whether
the String is a Palindrome String or not(without
reversing). */
public class Q13 {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        if(isPalindrome(str)) {
            System.out.println(str +" is Palindrome");
        } else {
            System.out.println(str +" is NOT Palindrome");
        }
        sc.close();
    }
}
