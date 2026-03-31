package String;

import java.util.Arrays;

public class Q46 {
    public static int lengthOfLongestSubstring(String s) {
        int[] index=new int[256];
        Arrays.fill(index, -1);
        int left=0, maxLen=0;

        for(int right=0; right<s.length(); right++) {
            char c=s.charAt(right);
            if(index[c]>=left) {
                left=index[c]+1;
            }

            index[c]=right;
            int tempLength=right-left+1;
            maxLen=Math.max(maxLen, tempLength);
        }
        return maxLen;
    }

    public static void main(String[] args) {
         System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
