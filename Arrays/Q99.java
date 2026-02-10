/*Implement binary search algorithm. */

import java.util.Scanner;

public class Q99 {
    public static int binarySearch(int[] nums, int val) {
        int start=0; int end=nums.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == val) {
                return mid;
            } else if(nums[mid]<val) {
                start = mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] nums = { 25, 34, 12, 45, 23, 28 };
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println(val+" is at index: "+binarySearch(nums, val));
        sc.close();
    }
}
