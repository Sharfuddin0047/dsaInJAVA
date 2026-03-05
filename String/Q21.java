package String;

/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR" */
public class Q21 {
    /**
     * 
     * it is wrong
     * 
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<=numRows; i++) {
            for(int j=i; j<s.length(); j=j+numRows+1) {
                sb.append(s.charAt(j));
                System.out.println(sb.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
