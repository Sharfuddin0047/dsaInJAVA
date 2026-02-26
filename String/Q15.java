package String;

import java.util.Scanner;

public class Q15 {
    public static void replace(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c!=' ') {
                sb.append(c);
            } else {
                sb.append("_");
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        replace(str);
        sc.close();
    }
}
