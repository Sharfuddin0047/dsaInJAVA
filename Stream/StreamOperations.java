import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(42, 7, 89, 13, 56, 90, 22, 11, 64, 78, 5, 99);

        // filter operation
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredList);

        // map operation
        List<Integer> mappedList = filteredList.stream()
                .map(x -> x / 2)
                .collect(Collectors.toList());
        System.out.println(mappedList);

        // distinct operation
        List<Integer> distinctList = mappedList.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        // sorted operation
        List<Integer> sortedList = distinctList.stream()
                .sorted((a, b) -> b - a)
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x%2 == 0)
                .map(x -> x/10)
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(collect);

        Integer collect1 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x%2 == 0)
                .map(x -> x/10)
                .distinct()
                .peek(System.out::println)
                .max((a,b) -> a-b)
                .get();
        System.out.println(collect1);
    }
}
