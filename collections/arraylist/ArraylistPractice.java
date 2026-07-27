package collections.arraylist;

import java.util.ArrayList;

public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); //O(1)
        System.out.println(list);

        // Get Operation O(1)
        System.out.println(list.get(2));

        //Remove Element O(n)
        list.remove(1);
        System.out.println(list);

        //Set O(n)
        list.set(0, 10);
        System.out.println(list);

        //Contains Element O(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        //size 
        System.out.println(list.size());

        // print the arraylist using loop
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get((i))+" ");
        }
        System.out.println();

        //print in reverse
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get((i))+" ");
        }
        System.out.println();

        
    }
}
