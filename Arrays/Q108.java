/*
Peak Index in a Mountain Array
*/

public class Q108 {
    public static int peakIndexInMountainArray(int[] nums) {
        int start=0; int end=nums.length-1;
        while(start<end) {
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1]) {
                end=end-1;
            } else if(nums[mid]<nums[mid+1]) {
                start=start+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums={8 ,12 ,18, 20, 17, 5, 1};
        System.out.println(peakIndexInMountainArray(nums));
    }
}
