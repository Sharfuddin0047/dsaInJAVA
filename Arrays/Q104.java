/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space. */

import java.util.HashMap;
import java.util.Scanner;

public class Q104 {
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int x: nums) {
            h1.put(x,h1.getOrDefault(x,0)+1);
        }  
        
        for(Integer x: h1.keySet()) {
            if(h1.get(x) == 1) {
                return x;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        sc.close();
    }
}
