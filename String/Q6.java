package String;

import java.util.Scanner;

/*WAJP to take a String input and count all the
vowel characters in the String. */
public class Q6 {
    public static int vowelCount(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Vowel count: "+vowelCount(str));
    }
}
