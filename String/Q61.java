package String;

public class Q61 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int start = 0; start < n; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1); // reverse only first k chars
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Q61 q = new Q61();
        System.out.println(q.reverseStr("abcdefg", 2)); 
        // Output: "bacdfeg"
        
        System.out.println(q.reverseStr("abcdefghijk", 3)); 
        // Output: "cbadefihgjk"
        
        System.out.println(q.reverseStr("a", 2)); 
        // Output: "a"
        
        System.out.println(q.reverseStr("abcdef", 4)); 
        // Output: "dcbaef"
    }
}
