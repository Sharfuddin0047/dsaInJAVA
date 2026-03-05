package String;

import java.util.Scanner;

public class Q34 {
     public static void printDuplicate(String str) {
        int[] freq=new int[256];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for(int i=0; i<256; i++) {
            char ch = (char)i;
            if(freq[i]>1) {
                System.out.println(ch+" Appeared "+freq[i] +" times");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        printDuplicate(str);
        sc.close();
    }
}
