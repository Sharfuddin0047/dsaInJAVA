package String;

import java.util.Scanner;

/*WAJP to take a String input and count all the
characters(excluding any special characters). */
public class Q4 {
    public static int getCount(String str) {
        int count=0;
        for(int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            if((c>='a'&&c<='z') || (c>='A'&&c<='Z') || (c>='0'&&c<='9')) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Character count without spaces is: "+getCount(str));
        sc.close();
    }
}
