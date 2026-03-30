package String;

import java.util.HashMap;

public class Q39 {

    public static int firstNonRepeatingIndex(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "swiss";
        int index = firstNonRepeatingIndex(s);
        if (index != -1) {
            System.out.println("First non-repeating character: '"
                    + s.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
