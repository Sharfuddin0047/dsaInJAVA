//we have a list of integers. find the second highest number in a list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamQ4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(20, 10, 10, 45, 30, 45, 5, 20));

        Optional<Integer> result = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if (result.isPresent()) {
            System.out.println(result.get());
        }
    }

}
