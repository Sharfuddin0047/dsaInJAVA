// We have a list of integers. get 2nd and 3rd element from it and return them in al list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQ3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> result = list.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
