package String;

import java.util.Scanner;

/*Design a method which will accept a String input and
return the reverse of the String.
a)By running loop from index 0
b)By running loop from last index
Input: Mohan
o/p: nahoM
Input: Hello Java
o/p: avaJ olleH */
public class Q11 {
    public static void reverse(String str) {
        StringBuilder s1=new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            s1.insert(0, c);
        }
        System.out.println(s1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        reverse(str);
        sc.close();
    }
}
