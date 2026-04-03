package String;

public class Q68 {
    public static void printAndCount(String str) {
        String max="";
        String[] arr = str.split("\\s+"); 
        for (String word : arr) {
            if (word.length() > max.length()) {
                max=word;
            }
        }
        System.out.println("max length word is: " + max);
    }

    public static void main(String[] args) {
        printAndCount("This is a simple test string");
        
    }
}
