package String;


/*
WAJP take a String input and print and count all
the words which has even number of
characters.
*/
public class Q66 {
     public static void printAndCount(String str) {
        int count = 0;
        String[] arr = str.split("\\s+"); 
        for (String word : arr) {
            if (word.length() % 2 == 0) {
                count++;
                System.out.println(word);
            }
        }

        System.out.println("Total words with even length: " + count);
    }

    public static void main(String[] args) {
        printAndCount("This is a simple test string");
        
    }
}
