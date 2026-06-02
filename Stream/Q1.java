import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,1,3,2,5,4));

        List<Integer> result = list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
