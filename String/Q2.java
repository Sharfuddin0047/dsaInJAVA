package String;

import java.util.Scanner;

/*WAJP to take a String input and count all
numeric characters in the String. */
public class Q2 {
    public static int getCount(String str) {
        int count=0;
        for(int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            if(c>='0'&&c<='9'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        System.out.println("Numeric character count is: "+getCount(str));
    }
}
