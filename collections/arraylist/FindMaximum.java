package collections.arraylist;

import java.util.ArrayList;

public class FindMaximum {
    public static void getMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (Integer x : list) {
            if (x>max) {
                max = x;
            }
        }
        System.out.println("aximum is: "+ max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); //O(1)
        System.out.println(list);

        getMax(list);
    }
}
