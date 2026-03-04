package String;

import java.util.Scanner;

/*WAJP to take a String input and remove all the
duplicate characters.
i/p: abcaxbdacdptx
o/p: abcxdpt */
public class Q24 {
    public static String removeDuplicatesChar(String s) {
        int[] chCount=new int[26];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            chCount[ch-'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<chCount.length; i++) {
            if(chCount[i]>0) {
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String with Duplicates: ");
        String S=sc.next();
        System.out.println("After removing Duplicates: "+removeDuplicatesChar(S));
        sc.close();
    }
}
