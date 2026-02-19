package String;


/*WAJP to take a String input and get length of
String without using length() method in at least
four different ways. */
public class Q1 {
    public static void getLength(String str) {
        int i=0;
        try {
            while(true) {
                str.charAt(i);
                i++;
            }
        } catch (Exception e) {
            System.out.println("length: " + i);
        }
    }
    public static void main(String[] args) {
        getLength("null");
    }
}
