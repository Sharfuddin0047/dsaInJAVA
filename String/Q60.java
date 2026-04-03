package String;

public class Q60 {
    public static void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
    public static void main(String[] args) {
        char[] arr1 = "hello".toCharArray();
        reverseString(arr1);
        System.out.println(arr1);
    }
}
