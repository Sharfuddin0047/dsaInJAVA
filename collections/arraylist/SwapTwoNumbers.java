package collections.arraylist;

import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void swapTwoNumbers(ArrayList<Integer> list, int idx1, int idx2){
        System.out.println("List before Swap: "+list);
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println("List after Swap: "+list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); //O(1)
        System.out.println(list);

        int idx1 =1; int idx2 = 3;
        swapTwoNumbers(list, idx1, idx2);
    }
}
