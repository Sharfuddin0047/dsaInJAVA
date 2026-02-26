package String;

/*Merge Strings Alternately:

https://leetcode.com/problems/merge-strings-
alternately/description/ */
public class Q19 {
    public static void mergeString(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str1.length() && i<str2.length()) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
            i++;
        }

        while(i<str1.length()) {
            sb.append(str1.charAt(i));
            i++;
        }

        while(i<str2.length()) {
            sb.append(str2.charAt(i));
            i++;
        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        mergeString(word1, word2);
    }
}
