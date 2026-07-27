package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); //O(1)
        System.out.println(list);

        System.out.println("Before Sorting" + list);
        // Sort in ASC
        Collections.sort(list);
        System.out.println("After Sorting" + list);

        // Sort in DESC
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Sorting" + list);

        //Another way
        Collections.sort(list, (a,b) -> b-a);
        System.out.println("After Sorting" + list);
    }
}
