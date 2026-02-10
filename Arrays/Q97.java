/*WAJP to print first half of the array elements in
ascending order and second half of the
elements in descending order.
i/p: [25, 34, 12, 45, 23, 28]
o/p: [12, 25, 34, 45, 28, 23] */

import java.util.Arrays;

public class Q97 {
    public static void ascBubbleSort(int[] nums) {
        int mid = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (i <= mid) {
                for (int j = 0; j < mid - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            } else if (i > mid) {
                for (int j = mid + 1; j < nums.length - (i - mid) - 1; j++) {
                    if (nums[j + 1] > nums[j]) {
                        int temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 25, 34, 12, 45, 23, 28 };
        ascBubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
