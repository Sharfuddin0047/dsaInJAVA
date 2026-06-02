//From a list of integer, find the frequency of each element in a list

package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamQ10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,3,4,4,1,2,1,1,1,5,6,5);

        Map<Integer, Long> result = list.stream()
            .collect(Collectors.groupingBy(
                elem -> elem, Collectors.counting()
            ));
        
        System.out.println(result);
    }
}
