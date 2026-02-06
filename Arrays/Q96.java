/*Problem Statement: In an IT company there are n number of Employees , they
are asked to stand in ascending order according to their heights. But some
employees are not currently standing in their correct position.

Your task is to find how many employees are there who are not standing in their
correct positions.
Example
height=[1,2,1,3,3,4,3]
The 4 employees at indexes 1,2,5 and 6 are not in the right positions. The
correct positions are (1,1,2,3,3,3,4).
Return 4. */

import java.util.Arrays;

public class Q96 {
    public static int wrongStanding(int[] height) {
        int[] newArr =new int[height.length];
        int count =0;
        int j= 0;
        for(int x: height) {
            newArr[j++] = x;
        }

        Arrays.sort(newArr);

        for(int i=0; i<newArr.length; i++) {
            if(height[i] != newArr[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] height={1,2,1,3,3,4,3};
        System.out.println(wrongStanding(height));
    }
}
