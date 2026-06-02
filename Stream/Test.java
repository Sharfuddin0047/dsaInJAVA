/*
creating Stream
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","Banana","Cherry");
        Stream<String> myStream = list.stream();

        String[] array = {"apple","Banana","Cherry"};
        Stream<String> = Arrays.stream(array);

        Stream<Integer> integerStream = stream.of(1,2,3);

        Stream<String> limit = Stream.iterate(0, n -> n+1).limit(100);

        Stream<String> limit1 = Stream<String>.generate(() -> "hello").limit(5);
    }
}