package String;

import java.util.Scanner;

/*WAJP to take a String input and count all the
characters without spaces in the String. */
public class Q3 {
    public static int getCount(String str) {
        int count=0;
        for(int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            if(c==' ') {
                continue;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Character count without spaces is: "+getCount(str));
    }
}
