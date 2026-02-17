import java.util.Arrays;

public class Q111 {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int mul=1; int zeroCount=0;
        
        for(int x:nums) {
            if(x==0) {
                zeroCount++;
            } else {
                mul*=x;
            }
        }

        if(zeroCount>1) {
            return ans;
        }
        if(zeroCount == 1) {
            for(int i=0; i<nums.length; i++) {
                if(nums[i]==0) {
                    ans[i]=mul;
                    return ans;
                }
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                ans[i]=mul;
            } else {
                ans[i]=mul/nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
