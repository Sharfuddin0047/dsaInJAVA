package String;

public class Q73 {
    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[128];   

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int target = 0;  
        
        for(int i=0; i<128; i++) {
            if(freq[i] > 0) {
                target = freq[i];
                break;   
            }
        }

        
        for(int i=0; i<128; i++) {
            if(freq[i] > 0 && freq[i] != target) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "abacbc";   // a=2, b=2, c=2 → all equal
        String s2 = "aaabb";    // a=3, b=2 → not equal

        System.out.println(areOccurrencesEqual(s1)); // true
        System.out.println(areOccurrencesEqual(s2));
    }
}
