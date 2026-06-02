// You have a list of strings. find the longest string in the list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamQ6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("java", "SpringBoot", "API"));

        Optional <String> result = list.stream()
                .max((a, b) -> a.length() - b.length());

        if(result.isPresent()) {
            System.out.println(result.get());
        }
    }
}
