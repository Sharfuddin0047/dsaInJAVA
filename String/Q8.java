package String;

import java.util.Scanner;

/*WAJP to take a String input and print all the
indexes where space characters are present in
the String. */
public class Q8 {
    public static void printIndex(String s) {
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(c==32) {
                System.out.println("index: "+i+" character: ' '");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        printIndex(str);
        sc.close();
    }
}
