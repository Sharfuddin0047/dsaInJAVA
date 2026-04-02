package String;

public class Q50 {
    public static String reorderSpaces(String text) {
        int spaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') spaces++;
        }

        String[] words = text.trim().split("\\s+");
        int n = words.length;

        if (n == 1) return words[0] + " ".repeat(spaces);

        int between = spaces / (n - 1);
        int extra = spaces % (n - 1);

        return String.join(" ".repeat(between), words) + " ".repeat(extra);
    }

    public static void main(String[] args) {
        String text = "  practice   makes   perfect";
        System.out.println("Input: \"" + text + "\"");
        System.out.println("Output: \"" + reorderSpaces(text) + "\"");

    }
}
