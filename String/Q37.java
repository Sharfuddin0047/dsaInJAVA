package String;

import java.util.HashMap;

/**
 * WAJP to print the character which is appeared
 * for the maximum times in the String.
 * If more than 1 character has appeared for
 * maximum time, return the smallest character.
 */
public class Q37 {

    public static char maxOccured(String str) {
        int max=0;
        char cha=0;
        HashMap<Character, Integer> h1=new HashMap<>();
        for (char key : str.toCharArray()) {
            h1.put(key, h1.getOrDefault(key,0)+1);
        }

        for (Character key : h1.keySet()) {
            if(h1.get(key)>max) {
                cha=key;
                max=h1.get(key);
            }  else if (h1.get(key) == max && key < cha) {
                cha = key;
            }
        }

        return cha;
    }

    public static void main(String[] args) {
        System.out.println("maximum time: " + maxOccured("hygiygffkjkhiiuiug") + " occured");
    }
}
