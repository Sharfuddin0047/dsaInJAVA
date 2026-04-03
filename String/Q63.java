package String;

/*
Expand Compressed String
Input: A string s in the format: alternating characters and
numbers (e.g., A4B2C3).
Output: A string where each character is repeated the number
of times specified.
Example:Input: "A4B2C3“
Output: "AAAABBCCC"
*/
public class Q63 {
    public static String expandCompressedString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            int count = Integer.parseInt(String.valueOf(str.charAt(i)));
            sb.append(String.valueOf(str.charAt(i - 1)).repeat(count));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandCompressedString("A4B2C3"));
        // Output: "AAAABBCCC"

    }
}
