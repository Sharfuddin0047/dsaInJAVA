/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. */

import java.util.Scanner;

public class Q102 {
    public static int mySqrt(int x) {
        if(x<2) return x;
        int start=1; int end=x/2;
        while(start<=end) {
            int mid = start+(end-start)/2;
            long sq = (long)mid*mid;
            if(sq==x) {
                return mid;
            } else if(sq>x) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return end;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println(mySqrt(x));
        sc.close();
    }
}
