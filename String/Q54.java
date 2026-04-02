package String;

/*
i/p: mohan and sohan are here.
o/p: mohan
and
sohan
are
here
*/
public class Q54 {
    public static void printString(String str) {
        String[] ch = str.trim().split("\\s+");
        for (String string : ch) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        String input = "mohan and sohan are here.";
        printString(input);
    }
}