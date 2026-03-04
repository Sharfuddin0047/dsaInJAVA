package String;

import java.util.Scanner;

/*
WAJP to print all the character of the String
exactly once(consider only alphabets in
Uppercase) */
public class Q29 {
    public static void printString(String str) {
        int[] count=new int[26];
        String s=str.toUpperCase();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z') {
                count[ch-'A']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count.length; i++) {
            if(count[i] >0) {
                sb.append((char)(i+'A'));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        printString(str);
        sc.close();
    }
}
