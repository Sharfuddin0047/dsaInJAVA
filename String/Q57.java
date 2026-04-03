package String;


/*
Reverse Words in a String
*/
public class Q57 {
    public static String reverseWords(String str) {
        String[] arr=str.trim().split("\\s+");
        
        for(int i=0; i<arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
