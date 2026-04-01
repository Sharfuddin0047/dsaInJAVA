package String;

/*Backspace String Compare */
public class Q48 {
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public static String build(String str) {
        StringBuilder sb = new StringBuilder();

        for(char x:str.toCharArray()) {
            if(x=='#') {
                if(sb.length()>0) {
                    sb.deleteCharAt(sb.length()-1);
                }
            } else {
                sb.append(x);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c")); 
        System.out.println(backspaceCompare("ab##", "c#d#")); 
        System.out.println(backspaceCompare("a#c", "b")); 
    }
}
