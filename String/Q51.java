package String;


/*
WAJP for below requirements:
i/p: “ab cdef g hi jklm”
o/p: “ml kjih g fe dcba”
*/
public class Q51 {
   public static String fulfillRequirement(String str) {
        
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

      
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i > 0) result.append(" ");        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "ab cdef g hi jklm";
        System.out.println("Input:  " + input);
        System.out.println("Output: " + fulfillRequirement(input));
    }
}
