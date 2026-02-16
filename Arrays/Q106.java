/*
Given a bitonic sequence of n distinct elements, and an integer x.
WAJP to find given element index in the bitonic sequence
in O(log n) time.
A Bitonic Sequence is a sequence of numbers that is first strictly
increasing then after a point decreasing.
• Input : arr[] = {8 ,12 ,18, 20, 17, 5, 1}, key = 20
Output : Found at index 3
• Input : arr[] = {5, 6, 7, 8, 9, 10, 3, 2, 1}, key = 30
Output : Not Found
 */

import java.util.Scanner;

public class Q106 {
    public static int bitonicIndex(int[] nums, int key) {
        int start = 0; int end = nums.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == key) {
                return mid;
            } else if(nums[mid]>key){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={8 ,12 ,18, 20, 17, 5, 1};
        System.out.println(bitonicIndex(nums, 20));
    }
}
