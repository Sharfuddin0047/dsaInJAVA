// You have a list of integers. Divide numbers into even and odd

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQ5 implements StreamQ5 {
   public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    Map<Boolean, List<Integer>> result = list.stream()
        .collect(Collectors.partitioningBy(x -> x%2 == 0));

    System.out.println(result);
   } 
}
