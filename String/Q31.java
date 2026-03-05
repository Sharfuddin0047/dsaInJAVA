package String;

import java.util.Scanner;

/*
WAJP to print all the character of the String
exactly once.
*/
public class Q31 {
    public static void printOnce(String str) {
        int[] chArray=new int[256];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            chArray[ch]++;
        }
        for(int i=0; i<256; i++){
            if(chArray[i]>0) {
                System.out.print((char)i+ " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        printOnce(str);
        sc.close();
    }
}
