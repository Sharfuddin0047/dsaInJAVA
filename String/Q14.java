package String;

public class Q14 {
    public static String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++) {
            if(isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println("First palindrome is: "+firstPalindrome(words));
    }
}
