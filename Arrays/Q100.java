/*Search an element in a sorted array and return the
index where it is found. If the element is not found
then return the index where it will fit in the array. */

import java.util.Scanner;

public class Q100 {
    public static int searchInsert(int[] nums, int val) {
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
        return start;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] nums = { 12, 23, 25, 28, 34, 45};
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println(val+" should be at index: "+searchInsert(nums, val));
        sc.close();
    }
}
