// From a list of integers, find all the odd numbers and return their squares

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQ2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> listSq = list.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(listSq);
    }
}
