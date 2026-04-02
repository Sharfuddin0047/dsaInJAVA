package String;

public class Q55 {
    public static void printString(String str) {
        String[] arr = str.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseString(arr[i]);
        }

        System.out.println(String.join(" ", arr));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        printString("mohan and sohan are here");
        printString("Hello Java");
    }
}
