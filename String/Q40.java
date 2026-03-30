package String;

import java.util.HashMap;


/*
Given a sting , return the character that appears the minimum number of
times in the string. The string will contain only ascii characters, from the
ranges (“a”-”z”,”A”-”Z”,0-9), and case matters . If there is a tie in the
minimum number of times a character appears in the string return the
character that appears first in the string.
*/
public class Q40 {
    public static char minOccur(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int min=Integer.MAX_VALUE;
        char cha=' ';
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq.get(str.charAt(i)) < min) {
                min = freq.get(str.charAt(i));
                cha = str.charAt(i);
            }
        }
        return cha;
    }
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println("Minimum occurred character: " + minOccur(s));
    }
}
