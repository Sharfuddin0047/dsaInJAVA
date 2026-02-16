import java.util.Scanner;

public class Q105 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            while(nums[i]>0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        int i;
        for(i=0;i<n;i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
        sc.close();
    }
}
