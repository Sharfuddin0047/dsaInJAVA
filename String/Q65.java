package String;


/*
WAJP to get sum of all numbers available in the
String:
i/p: ab45cde20xyz5pq40dd.
o/p: 110 (45+20+5+40)
*/
public class Q65 {
    public static int getSum(String str) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sb.append(str.charAt(i));
            } else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
                
            }
        }

        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum("A12B3"));
    }
}
