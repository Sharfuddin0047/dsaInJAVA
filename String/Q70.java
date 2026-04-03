package String;

public class Q70 {
    public static String capitalizeSentences(String str) {
        // Split by sentence-ending punctuation
        String[] sentences = str.split("(?<=[.!?])\\s*");  //Regex (?<=[.!?])\\s* splits the string after ., !, or ? and removes extra spaces.
        StringBuilder result = new StringBuilder();

        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (sentence.length() > 0) {
                // Capitalize first character, keep rest as is
                char firstChar = Character.toUpperCase(sentence.charAt(0));
                result.append(firstChar).append(sentence.substring(1)).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world. this is java! do you like coding? yes, i do.";
        System.out.println(capitalizeSentences(input));
        // Output: "Hello world. This is java! Do you like coding? Yes, i do."
    }
}
