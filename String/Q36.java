package String;

import java.util.Scanner;

/*
WAJP to print the character which is appeared
for the maximum times in the String.
*/
public class Q36 {
    public static void printMax(String str) {
        int[] freq=new int[256];
        for(int i=0;i<str.length(); i++) {
            char ch=str.charAt(i);
            freq[ch]++;
        }

        int max=0; char ch='\0';
        for(int i=0;i<256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ch = (char) i;
            }
        }
        System.out.println(ch+" appeared maximum times " +max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        printMax(str);
        sc.close();
    }
}
