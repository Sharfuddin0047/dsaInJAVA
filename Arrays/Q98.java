/*Implement linear search algorithm. */

import java.util.Scanner;

public class Q98 {
    public static int linearSearch(int[] nums, int val) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 25, 34, 12, 45, 23, 28 };
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println(val+" is at index: "+linearSearch(nums, val));
    }
}
