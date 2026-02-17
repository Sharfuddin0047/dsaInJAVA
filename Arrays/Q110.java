public class Q110 {
    public static int maxSubArray(int[] nums) {
        int currentSum=0; int maxSum=Integer.MIN_VALUE;

        for(int x:nums) {
            currentSum=Math.max(x,(currentSum+x));
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums={8 ,12 ,18, 20, 17, 5, 1};
        System.out.println(maxSubArray(nums));
    }
}
