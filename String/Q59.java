package String;

public class Q59 {
    public static String reverseWords(String str) {
        String[] arr = str.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseString(arr[i]);
        }

        return String.join(" ", arr);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World")); 
        System.out.println(reverseWords("  Java   Programming  ")); 
        System.out.println(reverseWords("a b c")); 
        System.out.println(reverseWords("   ")); 
    }
}
