/*Valid Perfect Square */

import java.util.Scanner;

public class Q103 {
    public static boolean isPerfectSquare(int num) {
        if(num<2) return true;

        int start=1; int end =num/2;
        while(start<=end) {
            int mid = start+(end-start)/2;
            long sq = (long)mid*mid;

            if(sq == num) {
                return true;
            } else if(sq>num) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println(isPerfectSquare(x));
        sc.close();
    }
}
