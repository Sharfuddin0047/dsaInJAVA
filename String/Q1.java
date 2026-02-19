package String;


/*WAJP to take a String input and get length of
String without using length() method in at least
four different ways. */
public class Q1 {
    public static void getLength(String str) {
        char[] s=str.toCharArray();
        int count=0;
        for(char x:s) {
            count++;
        }
        System.out.println("length: "+count);
    }
    public static void main(String[] args) {
        getLength("null");
    }
}
