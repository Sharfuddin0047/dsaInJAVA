package String;

/*Write a program in Java to remove path
information from a filename returning only its
file component.
i/p: "c:\\JavaProgram\\demo1.txt“
o/p: demo1.txt */
public class Q17 {
    public static void printFilename(String str) {
        int i=str.length()-1;
        StringBuilder sb = new StringBuilder();
        while(str.charAt(i)!=92) {
            sb.insert(0, str.charAt(i));
            i--;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "c:\\JavaProgram\\demo1.txt";
        printFilename(str);
    }
}
