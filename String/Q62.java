package String;


/*Reverse Prefix of Word */
public class Q62 {
    public static String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == ch) {
                index=i;
                break;
            }
        }

        if(index!=-1) {
            return new StringBuilder(word.substring(0, index+1)).reverse().toString()
       + word.substring(index+1);
        }

        return word;
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd')); 
    }
}
